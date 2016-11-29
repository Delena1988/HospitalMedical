package cn.joinhealth.hospmedical.filingpatient.handle;

import cn.joinhealth.hospmedical.model.filingpatient.FilingPatientReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class FilingPatientReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: filingPatientReq
     * @return: boolean
     */
    public static boolean validate(FilingPatientReq filingPatientReq) {
        if (!StringUtil.isEmpty(filingPatientReq.getOrganCode())) {
            return false;
        }
        if (filingPatientReq.getPageFlag()) {
            if (!StringUtil.isEmpty(filingPatientReq.getStartDate())
                    || filingPatientReq.getPageNum() <= 0
                    || filingPatientReq.getPageSize() <= 0) {
                return false;
            } else {
                return true;
            }
        } else {
            if (!StringUtil.isEmpty(filingPatientReq.getPatName())
                    || !StringUtil.isEmpty(filingPatientReq.getReportNo())
                    || !StringUtil.isEmpty(filingPatientReq.getPatIndexNo())
                    || !StringUtil.isEmpty(filingPatientReq.getVisitCardNo())
                    || !StringUtil.isEmpty(filingPatientReq.getIdNumber())
                    || !StringUtil.isEmpty(filingPatientReq.getMobileNo())) {
                return true;
            }

        }
        return false;
    }
}
