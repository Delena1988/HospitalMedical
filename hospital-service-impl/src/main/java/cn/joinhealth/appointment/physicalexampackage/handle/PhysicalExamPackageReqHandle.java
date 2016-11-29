package cn.joinhealth.appointment.physicalexampackage.handle;

import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackageReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/28
 */
public class PhysicalExamPackageReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: physicalExamPackageReq
     * @return: boolean
     */
    public static boolean validate(PhysicalExamPackageReq physicalExamPackageReq) {
        if (!StringUtil.isEmpty(physicalExamPackageReq.getOrganCode())) {
            return false;
        }
        return true;
    }
}
