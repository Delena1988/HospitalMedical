package com.lanniuh.appointment.remainingnosource.dao;


import com.lanniuh.appointment.model.remainingnosource.RemainingNoSource;
import com.lanniuh.appointment.model.remainingnosource.RemainingNoSourceReq;

import java.util.List;

public interface RemainingNoSourceMapper {
    List<RemainingNoSource> selectByParams(RemainingNoSourceReq remainingNoSourceReq);
}