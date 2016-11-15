package cn.joinhealth.appointment.nosource.dao;


import cn.joinhealth.appointment.model.nosource.NoSource;
import cn.joinhealth.appointment.model.nosource.NoSourceReq;

import java.util.List;

public interface NoSourceMapper {
    List<NoSource> selectByParams(NoSourceReq noSourceReq);
}