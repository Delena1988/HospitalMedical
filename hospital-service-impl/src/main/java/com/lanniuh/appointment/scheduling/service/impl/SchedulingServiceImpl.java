package com.lanniuh.appointment.scheduling.service.impl;

import com.lanniuh.appointment.model.scheduling.Scheduling;
import com.lanniuh.appointment.model.scheduling.SchedulingReq;
import com.lanniuh.appointment.scheduling.dao.SchedulingMapper;
import com.lanniuh.appointment.scheduling.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "schedulingService")
public class SchedulingServiceImpl implements SchedulingService {
    @Autowired
    private SchedulingMapper schedulingMapper;

    @Override
    public List<Scheduling> selectByParams(SchedulingReq schedulingReq) {
        return schedulingMapper.selectByParams(schedulingReq);
    }
}
