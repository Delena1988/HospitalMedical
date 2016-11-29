package cn.joinhealth.hospmedical.orderdetailinfo.handle;

import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfoReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class OrderDetailInfoReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: orderDetailInfoReq
     * @return: boolean
     */
    public static boolean validate(OrderDetailInfoReq orderDetailInfoReq) {
        if (!StringUtil.isEmpty(orderDetailInfoReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(orderDetailInfoReq.getPresNo())) {
            return true;
        }
        return false;
    }
}
