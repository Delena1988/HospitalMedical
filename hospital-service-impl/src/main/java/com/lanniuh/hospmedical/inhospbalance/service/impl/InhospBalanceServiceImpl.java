package com.lanniuh.hospmedical.inhospbalance.service.impl;

import com.lanniuh.hospmedical.inhospbalance.dao.InhospBalanceMapper;
import com.lanniuh.hospmedical.inhospbalance.service.InhospBalanceService;
import com.lanniuh.hospmedical.model.inhospbalance.InhospBalance;
import com.lanniuh.hospmedical.model.inhospbalance.InhospBalanceReq;
import com.lanniuh.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "inhospBalanceService")
public class InhospBalanceServiceImpl implements InhospBalanceService {
    @Autowired
    private InhospBalanceMapper inhospBalanceMapper;

    @Override
    public List<InhospBalance> selectByParams(InhospBalanceReq inhospBalanceReq) {
        List<InhospBalance> inhospBalanceList = inhospBalanceMapper.selectByParams(inhospBalanceReq);
        List<InhospBalance> newInhospBalanceList = new ArrayList<>();
        HashMap<String, InhospBalance> map = new HashMap<>();
        for (InhospBalance inhospBalance : inhospBalanceList) {
            String code = inhospBalance.getFeeCategCode();
            if (!map.containsKey(inhospBalance.getFeeCategCode())) {
                map.put(code, inhospBalance);
            } else {
                inhospBalance.setTotalMoney(StringUtil.StringAdd(map.get(code).getTotalMoney(), inhospBalance.getTotalMoney()));
                map.put(code, inhospBalance);
            }
        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            InhospBalance balance = map.get(iterator.next());
            if (StringUtil.StringToDouble(balance.getTotalMoney()) != 0) {
                newInhospBalanceList.add(balance);
            }
        }
        return newInhospBalanceList;
    }
}
