package com.lanniuh.appointment.scheduling.service;

import com.lanniuh.appointment.model.scheduling.Scheduling;
import com.lanniuh.appointment.model.scheduling.SchedulingReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SchedulingService {
    List<Scheduling> selectByParams(SchedulingReq schedulingReq);
}
