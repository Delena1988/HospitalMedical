package cn.joinhealth.hospmedical.inhospbalance.handle;

import cn.joinhealth.hospmedical.model.inhospbalance.InhospBalanceReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class InhospBalanceReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: inhospBalanceReq
     * @return: boolean
     */
    public static boolean validate(InhospBalanceReq inhospBalanceReq) {
        if (!StringUtil.isEmpty(inhospBalanceReq.getOrganCode())) {
            return false;
        }
        if (inhospBalanceReq.getDealNo() == null || inhospBalanceReq.getDealNo().size() <= 0) {
            return true;
        }
        return false;
    }
}
