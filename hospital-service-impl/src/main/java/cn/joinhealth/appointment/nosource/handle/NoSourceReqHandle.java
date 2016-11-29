package cn.joinhealth.appointment.nosource.handle;

import cn.joinhealth.appointment.model.nosource.NoSourceReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/28
 */
public class NoSourceReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: noSourceReq
     * @return: boolean
     */
    public static boolean validate(NoSourceReq noSourceReq) {
        if (!StringUtil.isEmpty(noSourceReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(noSourceReq.getSchedulingNo())) {
            return true;
        }
        return false;
    }
}
