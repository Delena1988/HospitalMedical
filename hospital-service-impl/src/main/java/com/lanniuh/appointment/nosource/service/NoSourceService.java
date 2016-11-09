package com.lanniuh.appointment.nosource.service;

import com.lanniuh.appointment.model.nosource.NoSource;
import com.lanniuh.appointment.model.nosource.NoSourceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface NoSourceService {
    List<NoSource> selectByParams(NoSourceReq noSourceReq);
}
