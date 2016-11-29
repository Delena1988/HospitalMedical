package cn.joinhealth.hospmedical.patientinfo.handle;

import cn.joinhealth.hospmedical.model.patientinfo.PatientInfoReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class PatientInfoReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: patientInfoReq
     * @return: boolean
     */
    public static boolean validate(PatientInfoReq patientInfoReq) {
        if (!StringUtil.isEmpty(patientInfoReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(patientInfoReq.getPatIndexNo())
                || !StringUtil.isEmpty(patientInfoReq.getPatName())
                || !StringUtil.isEmpty(patientInfoReq.getIdNumber())) {
            return true;
        }
        return false;
    }
}
