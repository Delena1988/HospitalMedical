package cn.joinhealth.appointment.remainingnosource.handle;

import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSourceReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/28
 */
public class RemainingNoSourceReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: remainingNoSourceReq
     * @return: boolean
     */
    public static boolean validate(RemainingNoSourceReq remainingNoSourceReq) {
        if (!StringUtil.isEmpty(remainingNoSourceReq.getOrganCode())) {
            return false;
        }
        if (remainingNoSourceReq.getSchedulingNo() != null && remainingNoSourceReq.getSchedulingNo().size() > 0) {
            return true;
        }
        return false;
    }
}
