package cn.joinhealth.hospmedical.physicalexamreport.handle;

import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReportReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class PhysicalExamReportReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: physicalExamReportReq
     * @return: boolean
     */
    public static boolean validate(PhysicalExamReportReq physicalExamReportReq) {
        if (!StringUtil.isEmpty(physicalExamReportReq.getOrganCode())) {
            return false;
        }
        if (physicalExamReportReq.getPageFlag()) {
            if (!StringUtil.isEmpty(physicalExamReportReq.getStartDate())
                    || physicalExamReportReq.getPageNum() <= 0
                    || physicalExamReportReq.getPageSize() <= 0) {
                return false;
            } else {
                return true;
            }
        } else {
            if (!StringUtil.isEmpty(physicalExamReportReq.getPatName())
                    && !StringUtil.isEmpty(physicalExamReportReq.getPatIndexNo())
                    || !StringUtil.isEmpty(physicalExamReportReq.getVisitCardNo())
                    || !StringUtil.isEmpty(physicalExamReportReq.getIdNumber())
                    || !StringUtil.isEmpty(physicalExamReportReq.getReportNo())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
