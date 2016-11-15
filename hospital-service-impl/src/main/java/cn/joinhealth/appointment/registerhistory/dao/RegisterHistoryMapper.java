package cn.joinhealth.appointment.registerhistory.dao;


import cn.joinhealth.appointment.model.registerhistory.RegisterHistoryReq;
import cn.joinhealth.appointment.model.registerhistory.RegisterHistory;

import java.util.List;

public interface RegisterHistoryMapper {
    List<RegisterHistory> selectByParams(RegisterHistoryReq registerHistoryReq);
}