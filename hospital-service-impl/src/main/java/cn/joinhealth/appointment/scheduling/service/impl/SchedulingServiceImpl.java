package cn.joinhealth.appointment.scheduling.service.impl;

import cn.joinhealth.appointment.scheduling.service.SchedulingService;
import cn.joinhealth.appointment.model.scheduling.Scheduling;
import cn.joinhealth.appointment.model.scheduling.SchedulingReq;
import cn.joinhealth.appointment.scheduling.dao.SchedulingMapper;
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
