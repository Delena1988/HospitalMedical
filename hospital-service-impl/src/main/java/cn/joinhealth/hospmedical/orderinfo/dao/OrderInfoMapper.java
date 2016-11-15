package cn.joinhealth.hospmedical.orderinfo.dao;


import cn.joinhealth.hospmedical.model.orderinfo.OrderInfo;
import cn.joinhealth.hospmedical.model.orderinfo.OrderInfoReq;

import java.util.List;

public interface OrderInfoMapper {
    List<OrderInfo> selectByParams(OrderInfoReq orderInfoReq);
}