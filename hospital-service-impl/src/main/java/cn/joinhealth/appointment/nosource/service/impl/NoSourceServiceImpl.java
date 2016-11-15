package cn.joinhealth.appointment.nosource.service.impl;

import cn.joinhealth.appointment.model.nosource.NoSource;
import cn.joinhealth.appointment.model.nosource.NoSourceReq;
import cn.joinhealth.appointment.nosource.dao.NoSourceMapper;
import cn.joinhealth.appointment.nosource.service.NoSourceService;
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
