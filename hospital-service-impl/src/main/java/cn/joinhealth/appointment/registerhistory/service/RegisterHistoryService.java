package cn.joinhealth.appointment.registerhistory.service;

import cn.joinhealth.appointment.model.registerhistory.RegisterHistoryReq;
import cn.joinhealth.appointment.model.registerhistory.RegisterHistory;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface RegisterHistoryService {
    /**
     * @Description:查询预约记录
     * @param: [registerHistoryReq]
     * @return: java.util.List<cn.joinhealth.appointment.model.registerhistory.RegisterHistory>
     */
    List<RegisterHistory> selectByParams(RegisterHistoryReq registerHistoryReq);
}
