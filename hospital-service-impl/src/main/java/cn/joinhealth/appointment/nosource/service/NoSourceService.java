package cn.joinhealth.appointment.nosource.service;

import cn.joinhealth.appointment.model.nosource.NoSource;
import cn.joinhealth.appointment.model.nosource.NoSourceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface NoSourceService {
    List<NoSource> selectByParams(NoSourceReq noSourceReq);
}
