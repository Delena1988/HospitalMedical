package com.lanniuh.appointment.registerhistory.service;

import com.lanniuh.appointment.model.registerhistory.RegisterHistory;
import com.lanniuh.appointment.model.registerhistory.RegisterHistoryReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface RegisterHistoryService {
    List<RegisterHistory> selectByParams(RegisterHistoryReq registerHistoryReq);
}
