package cn.joinhealth.hospmedical.testresult.dao;


import cn.joinhealth.hospmedical.model.testresult.TestResult;
import cn.joinhealth.hospmedical.model.testresult.TestResultReq;

import java.util.List;

public interface TestResultMapper {
    List<TestResult> selectByParams(TestResultReq testResultReq);
}
