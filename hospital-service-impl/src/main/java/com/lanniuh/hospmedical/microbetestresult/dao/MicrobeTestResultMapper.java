package com.lanniuh.hospmedical.microbetestresult.dao;


import com.lanniuh.hospmedical.model.microbetestresult.MicrobeTestResult;
import com.lanniuh.hospmedical.model.microbetestresult.MicrobeTestResultReq;

import java.util.List;

public interface MicrobeTestResultMapper {
    List<MicrobeTestResult> selectByParams(MicrobeTestResultReq microbeTestResultReq);
}