package cn.joinhealth.hospmedical.deptdict.handle;

import cn.joinhealth.hospmedical.model.deptdict.DeptDictReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 * 请求校验
 */
public class DeptDictReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: deptDictReq
     * @return: boolean
     */
    public static boolean validate(DeptDictReq deptDictReq) {
        if (!StringUtil.isEmpty(deptDictReq.getOrganCode())) {
            return false;
        } else {
            return true;
        }
    }
}
