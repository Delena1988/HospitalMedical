package com.lanniuh.hospmedical.orderdetailinfo.service.impl;

import com.lanniuh.hospmedical.model.orderdetailinfo.OrderDetailInfo;
import com.lanniuh.hospmedical.model.orderdetailinfo.OrderDetailInfoReq;
import com.lanniuh.hospmedical.orderdetailinfo.dao.OrderDetailInfoMapper;
import com.lanniuh.hospmedical.orderdetailinfo.service.OrderDetailInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "orderDetailInfoService")
public class OrderDetailInfoServiceImpl implements OrderDetailInfoService {
    @Autowired
    private OrderDetailInfoMapper orderDetailInfoMapper;

    @Override
    public List<OrderDetailInfo> selectByParams(OrderDetailInfoReq orderDetailInfoReq) {
        return orderDetailInfoMapper.selectByParams(orderDetailInfoReq);
    }
}
