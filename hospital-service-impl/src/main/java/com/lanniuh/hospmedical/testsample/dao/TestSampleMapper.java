package com.lanniuh.hospmedical.testsample.dao;


import com.lanniuh.hospmedical.model.testsample.TestSample;
import com.lanniuh.hospmedical.model.testsample.TestSampleReq;

import java.util.List;

public interface TestSampleMapper {
    List<TestSample> selectByParams(TestSampleReq testSampleReq);
}