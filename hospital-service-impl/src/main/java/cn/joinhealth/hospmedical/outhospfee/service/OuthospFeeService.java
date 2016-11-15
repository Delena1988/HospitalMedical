package cn.joinhealth.hospmedical.outhospfee.service;

import cn.joinhealth.hospmedical.model.outhospfee.OuthospFee;
import cn.joinhealth.hospmedical.model.outhospfee.OuthospFeeReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospFeeService {
    OuthospFee selectByParams(OuthospFeeReq outhospFeeReq);
}
