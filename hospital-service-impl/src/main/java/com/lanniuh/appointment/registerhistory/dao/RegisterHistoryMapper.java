package com.lanniuh.appointment.registerhistory.dao;


import com.lanniuh.appointment.model.registerhistory.RegisterHistory;
import com.lanniuh.appointment.model.registerhistory.RegisterHistoryReq;

import java.util.List;

public interface RegisterHistoryMapper {
    List<RegisterHistory> selectByParams(RegisterHistoryReq registerHistoryReq);
}