package cn.joinhealth.hospmedical.orderdetailinfo.service;

import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfo;
import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OrderDetailInfoService {
    List<OrderDetailInfo> selectByParams(OrderDetailInfoReq orderDetailInfoReq);
}
