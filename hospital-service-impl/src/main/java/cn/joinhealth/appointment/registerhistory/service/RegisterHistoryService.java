package cn.joinhealth.appointment.registerhistory.service;

import cn.joinhealth.appointment.model.registerhistory.RegisterHistoryReq;
import cn.joinhealth.appointment.model.registerhistory.RegisterHistory;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface RegisterHistoryService {
    List<RegisterHistory> selectByParams(RegisterHistoryReq registerHistoryReq);
}
