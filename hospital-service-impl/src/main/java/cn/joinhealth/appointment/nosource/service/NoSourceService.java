package cn.joinhealth.appointment.nosource.service;

import cn.joinhealth.appointment.model.nosource.NoSource;
import cn.joinhealth.appointment.model.nosource.NoSourceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface NoSourceService {
    /**
     * @Description:查询号源信息
     * @param: [noSourceReq]
     * @return: java.util.List<cn.joinhealth.appointment.model.nosource.NoSource>
     */
    List<NoSource> selectByParams(NoSourceReq noSourceReq);
}
