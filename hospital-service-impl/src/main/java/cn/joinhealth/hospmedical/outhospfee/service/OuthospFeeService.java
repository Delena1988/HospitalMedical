package cn.joinhealth.hospmedical.outhospfee.service;

import cn.joinhealth.hospmedical.model.outhospfee.OuthospFee;
import cn.joinhealth.hospmedical.model.outhospfee.OuthospFeeReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospFeeService {
    /**
     * @Description:查询门诊费用信息
     * @param: [outhospFeeReq]
     * @return: cn.joinhealth.hospmedical.model.outhospfee.OuthospFee
     */
    OuthospFee selectByParams(OuthospFeeReq outhospFeeReq);
}
