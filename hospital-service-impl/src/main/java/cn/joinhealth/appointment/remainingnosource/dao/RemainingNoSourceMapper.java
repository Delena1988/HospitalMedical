package cn.joinhealth.appointment.remainingnosource.dao;


import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSource;
import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSourceReq;

import java.util.List;

public interface RemainingNoSourceMapper {
    List<RemainingNoSource> selectByParams(RemainingNoSourceReq remainingNoSourceReq);
}