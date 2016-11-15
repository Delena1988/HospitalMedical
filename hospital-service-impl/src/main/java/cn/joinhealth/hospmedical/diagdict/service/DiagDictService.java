package cn.joinhealth.hospmedical.diagdict.service;


import cn.joinhealth.hospmedical.model.diagdict.DiagDict;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface DiagDictService {
    /**
     * @Description:查询所有疾病信息
     * @param: []
     * @return: java.util.List<cn.joinhealth.hospmedical.model.diagdict.DiagDict>
     */
    List<DiagDict> selectAll();
}
