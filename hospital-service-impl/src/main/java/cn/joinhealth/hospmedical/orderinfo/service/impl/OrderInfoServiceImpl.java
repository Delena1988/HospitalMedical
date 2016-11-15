package cn.joinhealth.hospmedical.orderinfo.service.impl;

import cn.joinhealth.hospmedical.model.orderinfo.OrderInfo;
import cn.joinhealth.hospmedical.model.orderinfo.OrderInfoReq;
import cn.joinhealth.hospmedical.orderinfo.dao.OrderInfoMapper;
import cn.joinhealth.hospmedical.orderinfo.service.OrderInfoService;
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
