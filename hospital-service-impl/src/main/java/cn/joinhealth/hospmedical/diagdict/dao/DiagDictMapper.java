package cn.joinhealth.hospmedical.diagdict.dao;


import cn.joinhealth.hospmedical.model.diagdict.DiagDict;
import cn.joinhealth.hospmedical.model.diagdict.DiagDictReq;

import java.util.List;

public interface DiagDictMapper {
    List<DiagDict> selectAll(DiagDictReq diagDictReq);
}