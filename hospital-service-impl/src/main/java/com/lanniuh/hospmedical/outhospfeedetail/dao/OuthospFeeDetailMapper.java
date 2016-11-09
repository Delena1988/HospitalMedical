package com.lanniuh.hospmedical.outhospfeedetail.dao;


import com.lanniuh.hospmedical.model.outhospfeedetail.OuthospFeeDetail;
import com.lanniuh.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;

import java.util.List;

public interface OuthospFeeDetailMapper {
    List<OuthospFeeDetail> selectByParams(OuthospFeeDetailReq outhospFeeDetailReq);
}