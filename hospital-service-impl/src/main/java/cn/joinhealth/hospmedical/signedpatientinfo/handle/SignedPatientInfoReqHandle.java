package cn.joinhealth.hospmedical.signedpatientinfo.handle;

import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class SignedPatientInfoReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: signedPatientInfoReq
     * @return: boolean
     */
    public static boolean validate(SignedPatientInfoReq signedPatientInfoReq) {
        if (!StringUtil.isEmpty(signedPatientInfoReq.getOrganCode())) {
            return false;
        }
        if (signedPatientInfoReq.getPageFlag()) {
            if (signedPatientInfoReq.getPageNum() <= 0
                    || signedPatientInfoReq.getPageSize() <= 0) {
                return false;
            } else {
                return true;
            }
        } else {
            if (!StringUtil.isEmpty(signedPatientInfoReq.getPatIndexNo())
                    || !StringUtil.isEmpty(signedPatientInfoReq.getVisitCardNo())
                    || !StringUtil.isEmpty(signedPatientInfoReq.getPatName())
                    || !StringUtil.isEmpty(signedPatientInfoReq.getIdNumber())
                    || !StringUtil.isEmpty(signedPatientInfoReq.getMobileNo())
                    || !StringUtil.isEmpty(signedPatientInfoReq.getSignedDrCode())
                    || !StringUtil.isEmpty(signedPatientInfoReq.getSignedDrName())
                    || !StringUtil.isEmpty(signedPatientInfoReq.getAgeStart())
                    || !StringUtil.isEmpty(signedPatientInfoReq.getAgeEnd())
                    || !StringUtil.isEmpty(signedPatientInfoReq.getDiagName())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
