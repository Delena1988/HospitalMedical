package cn.joinhealth.hospmedical.outhospbalance.handle;

import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalanceReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class OuthospBalanceReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: outhospBalanceReq
     * @return: boolean
     */
    public static boolean validate(OuthospBalanceReq outhospBalanceReq) {
        if (!StringUtil.isEmpty(outhospBalanceReq.getOrganCode())) {
            return false;
        }
        if (outhospBalanceReq.getDealNo() != null && outhospBalanceReq.getDealNo().size() > 0) {
            return true;
        }
        return false;
    }
}
