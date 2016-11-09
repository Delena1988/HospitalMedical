package com.lanniuh.hospmedical.microbetestresult.service;

import com.lanniuh.hospmedical.model.microbetestresult.MicrobeTestResult;
import com.lanniuh.hospmedical.model.microbetestresult.MicrobeTestResultReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface MicrobeTestResultService {
    List<MicrobeTestResult> selectByParams(MicrobeTestResultReq microbeTestResultReq);
}
