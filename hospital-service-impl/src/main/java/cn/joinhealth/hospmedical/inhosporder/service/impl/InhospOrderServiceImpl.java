package cn.joinhealth.hospmedical.inhosporder.service.impl;

import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.inhosporder.dao.InhospOrderMapper;
import cn.joinhealth.hospmedical.inhosporder.service.InhospOrderService;
import cn.joinhealth.hospmedical.model.inhosporder.InhospOrder;
import cn.joinhealth.hospmedical.model.inhosporder.InhospOrderReq;
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
