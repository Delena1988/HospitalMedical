package com.lanniuh.hospmedical.orderdetailinfo.service;

import com.lanniuh.hospmedical.model.orderdetailinfo.OrderDetailInfo;
import com.lanniuh.hospmedical.model.orderdetailinfo.OrderDetailInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OrderDetailInfoService {
    List<OrderDetailInfo> selectByParams(OrderDetailInfoReq orderDetailInfoReq);
}
