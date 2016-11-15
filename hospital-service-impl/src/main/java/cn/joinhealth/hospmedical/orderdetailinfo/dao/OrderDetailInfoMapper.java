package cn.joinhealth.hospmedical.orderdetailinfo.dao;


import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfo;
import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfoReq;

import java.util.List;

public interface OrderDetailInfoMapper {
    List<OrderDetailInfo> selectByParams(OrderDetailInfoReq orderDetailInfoReq);
}