package cn.joinhealth.hospmedical.diagdict.handle;

import cn.joinhealth.hospmedical.model.diagdict.DiagDictReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class DiagDictReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: diagDictReq
     * @return: boolean
     */
    public static boolean validate(DiagDictReq diagDictReq) {
        if (!StringUtil.isEmpty(diagDictReq.getOrganCode())) {
            return false;
        } else {
            return true;
        }
    }
}
