package com.lanniuh.appointment.remainingnosource.service.impl;

import com.lanniuh.appointment.model.remainingnosource.RemainingNoSource;
import com.lanniuh.appointment.model.remainingnosource.RemainingNoSourceReq;
import com.lanniuh.appointment.remainingnosource.dao.RemainingNoSourceMapper;
import com.lanniuh.appointment.remainingnosource.service.RemainingNoSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "remainingNoSourceService")
public class RemainingNoSourceServiceImpl implements RemainingNoSourceService {
    @Autowired
    private RemainingNoSourceMapper remainingNoSourceMapper;

    @Override
    public List<RemainingNoSource> selectByParams(RemainingNoSourceReq remainingNoSourceReq) {
        return remainingNoSourceMapper.selectByParams(remainingNoSourceReq);
    }
}
