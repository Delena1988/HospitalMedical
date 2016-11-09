package com.lanniuh.appointment.nosource.service.impl;

import com.lanniuh.appointment.model.nosource.NoSource;
import com.lanniuh.appointment.model.nosource.NoSourceReq;
import com.lanniuh.appointment.nosource.dao.NoSourceMapper;
import com.lanniuh.appointment.nosource.service.NoSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "noSourceService")
public class NoSourceServiceImpl implements NoSourceService {
    @Autowired
    private NoSourceMapper noSourceMapper;

    @Override
    public List<NoSource> selectByParams(NoSourceReq noSourceReq) {
        return noSourceMapper.selectByParams(noSourceReq);
    }
}
