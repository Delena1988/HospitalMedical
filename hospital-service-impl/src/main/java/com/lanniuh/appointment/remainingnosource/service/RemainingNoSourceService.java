package com.lanniuh.appointment.remainingnosource.service;

import com.lanniuh.appointment.model.remainingnosource.RemainingNoSource;
import com.lanniuh.appointment.model.remainingnosource.RemainingNoSourceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface RemainingNoSourceService {
    List<RemainingNoSource> selectByParams(RemainingNoSourceReq remainingNoSourceReq);
}
