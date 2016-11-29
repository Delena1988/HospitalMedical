package cn.joinhealth.hospmedical.orderinfo.handle;

import cn.joinhealth.hospmedical.model.orderinfo.OrderInfoReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class OrderInfoReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: orderInfoReq
     * @return: boolean
     */
    public static boolean validate(OrderInfoReq orderInfoReq) {
        if (!StringUtil.isEmpty(orderInfoReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(orderInfoReq.getOuthospSerialNo())) {
            return true;
        }
        return false;
    }
}
