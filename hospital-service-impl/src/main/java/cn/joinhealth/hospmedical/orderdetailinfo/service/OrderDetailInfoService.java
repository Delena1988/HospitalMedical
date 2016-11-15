package cn.joinhealth.hospmedical.orderdetailinfo.service;

import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfo;
import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OrderDetailInfoService {
    /**
     * @Description:查询处方明细信息
     * @param: [orderDetailInfoReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfo>
     */
    List<OrderDetailInfo> selectByParams(OrderDetailInfoReq orderDetailInfoReq);
}
