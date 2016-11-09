package com.lanniuh.hospmedical.inhospfeedetail.service.impl;

import com.lanniuh.hospmedical.inhospfeedetail.dao.InhospFeeDetailMapper;
import com.lanniuh.hospmedical.inhospfeedetail.service.InhospFeeDetailService;
import com.lanniuh.hospmedical.model.inhospfeedetail.InhospFeeDetail;
import com.lanniuh.hospmedical.model.inhospfeedetail.InhospFeeDetailReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "inhospFeeDetailService")
public class InhospFeeDetailServiceImpl implements InhospFeeDetailService {
    @Autowired
    private InhospFeeDetailMapper inhospFeeDetailMapper;
    @Override
    public List<InhospFeeDetail> selectByParams(InhospFeeDetailReq inhospFeeDetailReq) {
        return inhospFeeDetailMapper.selectByParams(inhospFeeDetailReq);
    }
}
