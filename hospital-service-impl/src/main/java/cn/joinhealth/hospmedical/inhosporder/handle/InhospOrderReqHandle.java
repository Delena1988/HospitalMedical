package cn.joinhealth.hospmedical.inhosporder.handle;

import cn.joinhealth.hospmedical.model.inhosporder.InhospOrderReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class InhospOrderReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: inhospOrderReq
     * @return: boolean
     */
    public static boolean validate(InhospOrderReq inhospOrderReq) {
        if (!StringUtil.isEmpty(inhospOrderReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(inhospOrderReq.getInhospSerialNo())
                && inhospOrderReq.getPageFlag()
                && inhospOrderReq.getPageNum() > 0
                && inhospOrderReq.getPageSize() > 0) {
            return true;
        }
        return false;
    }
}
