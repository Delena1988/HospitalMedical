package cn.joinhealth.appointment.scheduling.handle;

import cn.joinhealth.appointment.model.scheduling.SchedulingReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/28
 */
public class SchedulingReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: schedulingReq
     * @return: boolean
     */
    public static boolean validate(SchedulingReq schedulingReq) {
        if (!StringUtil.isEmpty(schedulingReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(schedulingReq.getStartDate())) {
            return true;
        }
        return false;
    }
}
