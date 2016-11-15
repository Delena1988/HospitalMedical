package cn.joinhealth.hospmedical.microbetestresult.dao;


import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResult;
import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResultReq;

import java.util.List;

public interface MicrobeTestResultMapper {
    List<MicrobeTestResult> selectByParams(MicrobeTestResultReq microbeTestResultReq);
}