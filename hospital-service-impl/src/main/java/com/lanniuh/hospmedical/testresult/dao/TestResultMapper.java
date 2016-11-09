package com.lanniuh.hospmedical.testresult.dao;


import com.lanniuh.hospmedical.model.testresult.TestResult;
import com.lanniuh.hospmedical.model.testresult.TestResultReq;

import java.util.List;

public interface TestResultMapper {
    List<TestResult> selectByParams(TestResultReq testResultReq);
}
