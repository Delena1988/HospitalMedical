package com.lanniuh.appointment.nosource.dao;


import com.lanniuh.appointment.model.nosource.NoSource;
import com.lanniuh.appointment.model.nosource.NoSourceReq;

import java.util.List;

public interface NoSourceMapper {
    List<NoSource> selectByParams(NoSourceReq noSourceReq);
}