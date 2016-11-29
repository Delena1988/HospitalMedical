package cn.joinhealth.hospmedical.outhospfeedetail.handle;

import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class OuthospFeeDetailReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: outhospFeeDetailReq
     * @return: boolean
     */
    public static boolean validate(OuthospFeeDetailReq outhospFeeDetailReq) {
        if (!StringUtil.isEmpty(outhospFeeDetailReq.getOrganCode())) {
            return false;
        }
        if (outhospFeeDetailReq.getDealNo() != null && outhospFeeDetailReq.getDealNo().size() > 0) {
            return true;
        }
        return false;
    }
}
