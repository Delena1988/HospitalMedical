package cn.joinhealth.hospmedical.orderdetailinfo.service.impl;

import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfo;
import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfoReq;
import cn.joinhealth.hospmedical.orderdetailinfo.dao.OrderDetailInfoMapper;
import cn.joinhealth.hospmedical.orderdetailinfo.service.OrderDetailInfoService;
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
