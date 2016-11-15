package cn.joinhealth.appointment.scheduling.dao;


import cn.joinhealth.appointment.model.scheduling.Scheduling;
import cn.joinhealth.appointment.model.scheduling.SchedulingReq;

import java.util.List;

public interface SchedulingMapper {
    List<Scheduling> selectByParams(SchedulingReq schedulingReq);
}