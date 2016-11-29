package cn.joinhealth.hospmedical.cardnoinfo.handle;

import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfoReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 * 请求校验
 */
public class CardNoInfoReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: cardNoInfoReq
     * @return: boolean
     */
    public static boolean validate(CardNoInfoReq cardNoInfoReq) {
        if (!StringUtil.isEmpty(cardNoInfoReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(cardNoInfoReq.getPatIndexNo())) {
            return true;
        }
        if (!StringUtil.isEmpty(cardNoInfoReq.getPatName()) && (!StringUtil.isEmpty(cardNoInfoReq.getVisitCardNo()) || !StringUtil.isEmpty(cardNoInfoReq.getIdNumber()))) {
            return true;
        }
        if (!StringUtil.isEmpty(cardNoInfoReq.getVisitCardType()) && !StringUtil.isEmpty(cardNoInfoReq.getVisitCardNo())) {
            return true;
        }
        return false;
    }
}
