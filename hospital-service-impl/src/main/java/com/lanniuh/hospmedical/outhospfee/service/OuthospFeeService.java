package com.lanniuh.hospmedical.outhospfee.service;

import com.lanniuh.hospmedical.model.outhospfee.OuthospFee;
import com.lanniuh.hospmedical.model.outhospfee.OuthospFeeReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospFeeService {
    OuthospFee selectByParams(OuthospFeeReq outhospFeeReq);
}
