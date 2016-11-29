package cn.joinhealth.appointment.registerhistory.handle;

import cn.joinhealth.appointment.model.registerhistory.RegisterHistoryReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/28
 */
public class RegisterHistoryReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: registerHistoryReq
     * @return: boolean
     */
    public static boolean validate(RegisterHistoryReq registerHistoryReq) {
        if (!StringUtil.isEmpty(registerHistoryReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(registerHistoryReq.getStartDate())) {
            return true;
        }
        return false;
    }
}
