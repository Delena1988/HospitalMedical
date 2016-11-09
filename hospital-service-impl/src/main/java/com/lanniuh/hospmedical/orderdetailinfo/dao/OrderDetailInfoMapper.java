package com.lanniuh.hospmedical.orderdetailinfo.dao;


import com.lanniuh.hospmedical.model.orderdetailinfo.OrderDetailInfo;
import com.lanniuh.hospmedical.model.orderdetailinfo.OrderDetailInfoReq;

import java.util.List;

public interface OrderDetailInfoMapper {
    List<OrderDetailInfo> selectByParams(OrderDetailInfoReq orderDetailInfoReq);
}