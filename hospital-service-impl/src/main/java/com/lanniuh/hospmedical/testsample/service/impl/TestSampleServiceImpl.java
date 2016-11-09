package com.lanniuh.hospmedical.testsample.service.impl;

import com.lanniuh.hospmedical.model.testsample.TestSample;
import com.lanniuh.hospmedical.model.testsample.TestSampleReq;
import com.lanniuh.hospmedical.testsample.dao.TestSampleMapper;
import com.lanniuh.hospmedical.testsample.service.TestSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "testSampleService")
public class TestSampleServiceImpl implements TestSampleService {
    @Autowired
    private TestSampleMapper testSampleMapper;

    @Override
    public List<TestSample> selectByParams(TestSampleReq testSampleReq) {
        return testSampleMapper.selectByParams(testSampleReq);
    }
}
