package cn.joinhealth.hospmedical.microbetestresult.service;

import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResult;
import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResultReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface MicrobeTestResultService {
    List<MicrobeTestResult> selectByParams(MicrobeTestResultReq microbeTestResultReq);
}
