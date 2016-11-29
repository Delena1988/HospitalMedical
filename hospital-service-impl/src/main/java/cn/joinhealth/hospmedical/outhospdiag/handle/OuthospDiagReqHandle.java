package cn.joinhealth.hospmedical.outhospdiag.handle;

import cn.joinhealth.hospmedical.model.outhospdiag.OuthospDiagReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class OuthospDiagReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: outhospDiagReq
     * @return: boolean
     */
    public static boolean validate(OuthospDiagReq outhospDiagReq) {
        if (!StringUtil.isEmpty(outhospDiagReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(outhospDiagReq.getOuthospSerialNo())) {
            return true;
        }
        return false;
    }
}
