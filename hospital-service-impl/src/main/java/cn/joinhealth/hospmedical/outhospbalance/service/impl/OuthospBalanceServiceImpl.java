package cn.joinhealth.hospmedical.outhospbalance.service.impl;

import cn.joinhealth.hospmedical.outhospbalance.dao.OuthospBalanceMapper;
import cn.joinhealth.hospmedical.outhospbalance.service.OuthospBalanceService;
import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalance;
import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalanceReq;
import cn.joinhealth.util.StringUtil;
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
@Service(value = "outhospBalanceService")
public class OuthospBalanceServiceImpl implements OuthospBalanceService {
    @Autowired
    private OuthospBalanceMapper outhospBalanceMapper;
    @Override
    public List<OuthospBalance> selectByParams(OuthospBalanceReq outhospBalanceReq) {
        List<OuthospBalance> outhospBalanceList = outhospBalanceMapper.selectByParams(outhospBalanceReq);
        List<OuthospBalance> newOuthospBalanceList = new ArrayList<>();

        HashMap<String, OuthospBalance> map = new HashMap<>();
        for (OuthospBalance outhospBalance : outhospBalanceList) {
            String code = outhospBalance.getFeeCategCode();

            if (!map.containsKey(outhospBalance.getFeeCategCode())) {
                map.put(code, outhospBalance);
            } else {
                outhospBalance.setTotalMoney(StringUtil.StringAdd(map.get(code).getTotalMoney(), outhospBalance.getTotalMoney()));
                map.put(code, outhospBalance);
            }
        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            OuthospBalance balance = map.get(iterator.next());
            if (StringUtil.StringToDouble(balance.getTotalMoney()) != 0) {
                newOuthospBalanceList.add(balance);
            }
        }
        return newOuthospBalanceList;
    }
}
