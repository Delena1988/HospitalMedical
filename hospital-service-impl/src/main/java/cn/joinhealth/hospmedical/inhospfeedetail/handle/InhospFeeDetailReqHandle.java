package cn.joinhealth.hospmedical.inhospfeedetail.handle;

import cn.joinhealth.hospmedical.model.inhospfeedetail.InhospFeeDetailReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class InhospFeeDetailReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: inhospFeeDetailReq
     * @return: boolean
     */
    public static boolean validate(InhospFeeDetailReq inhospFeeDetailReq) {
        if (!StringUtil.isEmpty(inhospFeeDetailReq.getOrganCode())) {
            return false;
        }
        if (inhospFeeDetailReq.getDealNo() == null || inhospFeeDetailReq.getDealNo().size() <= 0) {
            return true;
        }
        return false;
    }
}
