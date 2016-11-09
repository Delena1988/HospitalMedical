package com.lanniuh.hospmedical.outhospfeedetail.service.impl;

import com.lanniuh.hospmedical.model.outhospfeedetail.OuthospFeeDetail;
import com.lanniuh.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;
import com.lanniuh.hospmedical.outhospfeedetail.dao.OuthospFeeDetailMapper;
import com.lanniuh.hospmedical.outhospfeedetail.service.OuthospFeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "outhospFeeDetailService")
public class OuthospFeeDetailServiceImpl implements OuthospFeeDetailService {
    @Autowired
    private OuthospFeeDetailMapper outhospFeeDetailMapper;

    @Override
    public List<OuthospFeeDetail> selectByParams(OuthospFeeDetailReq outhospFeeDetailReq) {
        return outhospFeeDetailMapper.selectByParams(outhospFeeDetailReq);
    }
}
