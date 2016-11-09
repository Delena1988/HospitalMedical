package com.lanniuh.hospmedical.orderinfo.service;

import com.lanniuh.hospmedical.model.orderinfo.OrderInfo;
import com.lanniuh.hospmedical.model.orderinfo.OrderInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OrderInfoService {
    List<OrderInfo> selectByParams(OrderInfoReq orderInfoReq);
}
