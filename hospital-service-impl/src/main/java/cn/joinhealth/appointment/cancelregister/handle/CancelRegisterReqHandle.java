package cn.joinhealth.appointment.cancelregister.handle;

import cn.joinhealth.appointment.model.cancelregister.CancelRegisterReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/28
 */
public class CancelRegisterReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: cancelRegisterReq
     * @return: boolean
     */
    public static boolean validate(CancelRegisterReq cancelRegisterReq) {
        if (!StringUtil.isEmpty(cancelRegisterReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(cancelRegisterReq.getPatName())
                || !StringUtil.isEmpty(cancelRegisterReq.getSchedulingNo())
                || !StringUtil.isEmpty(cancelRegisterReq.getSeqNo())
                || !StringUtil.isEmpty(cancelRegisterReq.getPassword())) {
            return true;
        }
        return false;
    }
}
