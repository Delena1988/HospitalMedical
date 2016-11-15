package cn.joinhealth.hospmedical.testresult.service;

import cn.joinhealth.hospmedical.model.testresult.TestResult;
import cn.joinhealth.hospmedical.model.testresult.TestResultReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface TestResultService {
    List<TestResult> selectByParams(TestResultReq testResultReq);
}
