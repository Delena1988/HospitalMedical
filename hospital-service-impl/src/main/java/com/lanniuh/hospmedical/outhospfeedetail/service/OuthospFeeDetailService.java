package com.lanniuh.hospmedical.outhospfeedetail.service;

import com.lanniuh.hospmedical.model.outhospfeedetail.OuthospFeeDetail;
import com.lanniuh.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospFeeDetailService {
    List<OuthospFeeDetail> selectByParams(OuthospFeeDetailReq outhospFeeDetailReq);
}
