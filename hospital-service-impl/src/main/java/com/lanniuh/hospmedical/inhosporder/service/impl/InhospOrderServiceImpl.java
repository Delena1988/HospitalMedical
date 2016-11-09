package com.lanniuh.hospmedical.inhosporder.service.impl;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.inhosporder.dao.InhospOrderMapper;
import com.lanniuh.hospmedical.inhosporder.service.InhospOrderService;
import com.lanniuh.hospmedical.model.inhosporder.InhospOrder;
import com.lanniuh.hospmedical.model.inhosporder.InhospOrderReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "inhospOrderService")
public class InhospOrderServiceImpl implements InhospOrderService {
    @Autowired
    private InhospOrderMapper inhospOrderMapper;

    @Override
    public Page<InhospOrder> selectByParams(InhospOrderReq inhospOrderReq) {
        return inhospOrderMapper.selectByParams(inhospOrderReq);
    }
}
