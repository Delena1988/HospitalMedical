package cn.joinhealth.hospmedical.examrequisition.handle;

import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisitionReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class ExamRequisitionReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: examRequisitionReq
     * @return: boolean
     */
    public static boolean validate(ExamRequisitionReq examRequisitionReq) {
        if (!StringUtil.isEmpty(examRequisitionReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(examRequisitionReq.getOuthospNo())
                || !StringUtil.isEmpty(examRequisitionReq.getOuthospSerialNo())
                || !StringUtil.isEmpty(examRequisitionReq.getInhospNo())
                || !StringUtil.isEmpty(examRequisitionReq.getInhospSerialNo())) {
            return true;
        }
        return false;
    }
}
