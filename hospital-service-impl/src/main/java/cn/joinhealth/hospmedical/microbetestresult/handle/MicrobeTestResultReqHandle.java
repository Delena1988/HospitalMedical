package cn.joinhealth.hospmedical.microbetestresult.handle;

import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResultReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class MicrobeTestResultReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: microbeTestResultReq
     * @return: boolean
     */
    public static boolean validate(MicrobeTestResultReq microbeTestResultReq) {
        if (!StringUtil.isEmpty(microbeTestResultReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(microbeTestResultReq.getReportNo())) {
            return true;
        }
        return false;
    }
}
