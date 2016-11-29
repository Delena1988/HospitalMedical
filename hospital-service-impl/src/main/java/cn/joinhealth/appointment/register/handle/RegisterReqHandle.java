package cn.joinhealth.appointment.register.handle;

import cn.joinhealth.appointment.model.register.RegisterReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/28
 */
public class RegisterReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: registerReq
     * @return: boolean
     */
    public static boolean validate(RegisterReq registerReq) {
        if (!StringUtil.isEmpty(registerReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(registerReq.getPatName())
                || !StringUtil.isEmpty(registerReq.getSchedulingNo())
                || !StringUtil.isEmpty(registerReq.getAp())
                || !StringUtil.isEmpty(registerReq.getSeqNo())
                || !StringUtil.isEmpty(registerReq.getVisitCardNo())
                || !StringUtil.isEmpty(registerReq.getVisitDate())) {
            return true;
        }
        return false;
    }
}
