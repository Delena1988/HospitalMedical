package cn.joinhealth.hospmedical.diagdict.service;


import cn.joinhealth.hospmedical.model.diagdict.DiagDict;
import cn.joinhealth.hospmedical.model.diagdict.DiagDictReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface DiagDictService {
    /**
     * @Description:查询所有疾病信息
     * @param: diagDictReq
     * @return: List<DiagDict>
     */
    List<DiagDict> selectAll(DiagDictReq diagDictReq);
}
