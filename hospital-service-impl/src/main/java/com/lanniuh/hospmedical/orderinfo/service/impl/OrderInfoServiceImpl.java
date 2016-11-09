package com.lanniuh.hospmedical.orderinfo.service.impl;

import com.lanniuh.hospmedical.model.orderinfo.OrderInfo;
import com.lanniuh.hospmedical.model.orderinfo.OrderInfoReq;
import com.lanniuh.hospmedical.orderinfo.dao.OrderInfoMapper;
import com.lanniuh.hospmedical.orderinfo.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "orderInfoService")
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> selectByParams(OrderInfoReq orderInfoReq) {
        return orderInfoMapper.selectByParams(orderInfoReq);
    }
}
