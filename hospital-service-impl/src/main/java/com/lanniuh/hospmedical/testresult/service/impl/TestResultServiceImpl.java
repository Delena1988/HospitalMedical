package com.lanniuh.hospmedical.testresult.service.impl;

import com.lanniuh.hospmedical.model.testresult.TestResult;
import com.lanniuh.hospmedical.model.testresult.TestResultReq;
import com.lanniuh.hospmedical.testresult.dao.TestResultMapper;
import com.lanniuh.hospmedical.testresult.service.TestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "testResultService")
public class TestResultServiceImpl implements TestResultService {
    @Autowired
    private TestResultMapper testResultMapper;

    @Override
    public List<TestResult> selectByParams(TestResultReq testResultReq) {
        return testResultMapper.selectByParams(testResultReq);
    }
}
