package cn.joinhealth.hospmedical.physicalexamresult.handle;

import cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResultReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class PhysicalExamResultReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: physicalExamResultReq
     * @return: boolean
     */
    public static boolean validate(PhysicalExamResultReq physicalExamResultReq) {
        if (!StringUtil.isEmpty(physicalExamResultReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(physicalExamResultReq.getReportNo())) {
            return true;
        }
        return false;
    }
}
