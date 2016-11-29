package cn.joinhealth.hospmedical.inhospdiag.handle;

import cn.joinhealth.hospmedical.model.inhospdiag.InhospDiagReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class InhospDiagReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: inhospDiagReq
     * @return: boolean
     */
    public static boolean validate(InhospDiagReq inhospDiagReq) {
        if (!StringUtil.isEmpty(inhospDiagReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(inhospDiagReq.getInhospSerialNo())) {
            return true;
        }
        return false;
    }
}
