package cn.joinhealth.hospmedical.inhospfee.handle;

import cn.joinhealth.hospmedical.model.inhospfee.InhospFeeReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class InhospFeeReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: inhospFeeReq
     * @return: boolean
     */
    public static boolean validate(InhospFeeReq inhospFeeReq) {
        if (!StringUtil.isEmpty(inhospFeeReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(inhospFeeReq.getInhospSerialNo())) {
            return true;
        }
        return false;
    }
}
