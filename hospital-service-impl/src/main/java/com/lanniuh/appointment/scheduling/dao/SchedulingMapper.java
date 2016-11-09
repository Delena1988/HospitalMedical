package com.lanniuh.appointment.scheduling.dao;


import com.lanniuh.appointment.model.scheduling.Scheduling;
import com.lanniuh.appointment.model.scheduling.SchedulingReq;

import java.util.List;

public interface SchedulingMapper {
    List<Scheduling> selectByParams(SchedulingReq schedulingReq);
}