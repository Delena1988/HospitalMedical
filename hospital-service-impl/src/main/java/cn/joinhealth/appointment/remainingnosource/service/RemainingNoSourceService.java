package cn.joinhealth.appointment.remainingnosource.service;

import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSource;
import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSourceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface RemainingNoSourceService {
    /**
     * @Description:查询剩余好远
     * @param: [remainingNoSourceReq]
     * @return: java.util.List<cn.joinhealth.appointment.model.remainingnosource.RemainingNoSource>
     */
    List<RemainingNoSource> selectByParams(RemainingNoSourceReq remainingNoSourceReq);
}
