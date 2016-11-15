package cn.joinhealth.appointment.scheduling.service;

import cn.joinhealth.appointment.model.scheduling.Scheduling;
import cn.joinhealth.appointment.model.scheduling.SchedulingReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SchedulingService {
    List<Scheduling> selectByParams(SchedulingReq schedulingReq);
}
