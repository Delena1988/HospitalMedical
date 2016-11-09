package com.lanniuh.hospmedical.outhospfee.dao;


import com.lanniuh.hospmedical.model.outhospfee.OuthospFee;
import com.lanniuh.hospmedical.model.outhospfee.OuthospFeeReq;

import java.util.List;

public interface OuthospFeeMapper {
    List<OuthospFee> selectByParams(OuthospFeeReq outhospFeeReq);
}