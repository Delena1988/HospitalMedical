package cn.joinhealth.hospmedical.signs.handle;

import cn.joinhealth.hospmedical.model.signs.SignsReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class SignsReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: signsReq
     * @return: boolean
     */
    public static boolean validate(SignsReq signsReq) {
        if (!StringUtil.isEmpty(signsReq.getOrganCode())) {
            return false;
        }
        if (signsReq.getPageFlag()) {
            if (signsReq.getPageNum() <= 0
                    || signsReq.getPageSize() <= 0) {
                return false;
            } else {
                return true;
            }
        } else {
            if (!StringUtil.isEmpty(signsReq.getPatIndexNo())
                    || !StringUtil.isEmpty(signsReq.getVisitCardNo())
                    || !StringUtil.isEmpty(signsReq.getPatName())
                    || !StringUtil.isEmpty(signsReq.getIdNumber())
                    || !StringUtil.isEmpty(signsReq.getOuthospNo())
                    || !StringUtil.isEmpty(signsReq.getOuthospSerialNo())
                    || !StringUtil.isEmpty(signsReq.getInhospNo())
                    || !StringUtil.isEmpty(signsReq.getInhospSerialNo())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
