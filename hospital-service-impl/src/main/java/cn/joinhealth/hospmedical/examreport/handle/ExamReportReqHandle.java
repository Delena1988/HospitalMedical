package cn.joinhealth.hospmedical.examreport.handle;

import cn.joinhealth.hospmedical.model.examreport.ExamReportReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class ExamReportReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: examReportReq
     * @return: boolean
     */
    public static boolean validate(ExamReportReq examReportReq) {
        if (!StringUtil.isEmpty(examReportReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(examReportReq.getRequisitionNo())
                || !StringUtil.isEmpty(examReportReq.getPatIndexNo())
                || !StringUtil.isEmpty(examReportReq.getOuthospNo())
                || !StringUtil.isEmpty(examReportReq.getOuthospSerialNo())
                || !StringUtil.isEmpty(examReportReq.getInhospNo())
                || !StringUtil.isEmpty(examReportReq.getInhospSerialNo())) {
            return true;
        }
        return false;
    }
}
