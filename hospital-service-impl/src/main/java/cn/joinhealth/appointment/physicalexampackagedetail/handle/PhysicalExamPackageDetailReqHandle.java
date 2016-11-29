package cn.joinhealth.appointment.physicalexampackagedetail.handle;

import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/28
 */
public class PhysicalExamPackageDetailReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: physicalExamPackageDetailReq
     * @return: boolean
     */
    public static boolean validate(PhysicalExamPackageDetailReq physicalExamPackageDetailReq) {
        if (!StringUtil.isEmpty(physicalExamPackageDetailReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(physicalExamPackageDetailReq.getPackageNo())) {
            return true;
        }
        return false;
    }
}
