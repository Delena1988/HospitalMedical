package cn.joinhealth.hospmedical.orderinfo.service;

import cn.joinhealth.hospmedical.model.orderinfo.OrderInfo;
import cn.joinhealth.hospmedical.model.orderinfo.OrderInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OrderInfoService {
    List<OrderInfo> selectByParams(OrderInfoReq orderInfoReq);
}
