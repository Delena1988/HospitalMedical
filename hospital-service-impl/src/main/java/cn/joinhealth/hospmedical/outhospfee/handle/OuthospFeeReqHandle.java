package cn.joinhealth.hospmedical.outhospfee.handle;

import cn.joinhealth.hospmedical.model.outhospfee.OuthospFeeReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class OuthospFeeReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: outhospFeeReq
     * @return: boolean
     */
    public static boolean validate(OuthospFeeReq outhospFeeReq) {
        if (!StringUtil.isEmpty(outhospFeeReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(outhospFeeReq.getOuthospSerialNo())) {
            return true;
        }
        return false;
    }
}
