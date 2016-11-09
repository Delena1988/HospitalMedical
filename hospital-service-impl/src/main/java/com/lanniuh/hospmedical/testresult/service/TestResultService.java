package com.lanniuh.hospmedical.testresult.service;

import com.lanniuh.hospmedical.model.testresult.TestResult;
import com.lanniuh.hospmedical.model.testresult.TestResultReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface TestResultService {
    List<TestResult> selectByParams(TestResultReq testResultReq);
}
