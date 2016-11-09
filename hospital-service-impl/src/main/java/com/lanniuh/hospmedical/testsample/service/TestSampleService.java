package com.lanniuh.hospmedical.testsample.service;

import com.lanniuh.hospmedical.model.testsample.TestSample;
import com.lanniuh.hospmedical.model.testsample.TestSampleReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface TestSampleService {
    List<TestSample> selectByParams(TestSampleReq testSampleReq);
}
