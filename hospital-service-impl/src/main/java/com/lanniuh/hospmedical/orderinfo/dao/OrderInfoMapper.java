package com.lanniuh.hospmedical.orderinfo.dao;


import com.lanniuh.hospmedical.model.orderinfo.OrderInfo;
import com.lanniuh.hospmedical.model.orderinfo.OrderInfoReq;

import java.util.List;

public interface OrderInfoMapper {
    List<OrderInfo> selectByParams(OrderInfoReq orderInfoReq);
}