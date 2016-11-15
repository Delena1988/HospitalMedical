package cn.joinhealth.appointment.remainingnosource.service.impl;

import cn.joinhealth.appointment.remainingnosource.dao.RemainingNoSourceMapper;
import cn.joinhealth.appointment.remainingnosource.service.RemainingNoSourceService;
import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSource;
import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSourceReq;
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
