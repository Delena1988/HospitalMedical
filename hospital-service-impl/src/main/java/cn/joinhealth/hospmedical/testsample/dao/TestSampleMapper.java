package cn.joinhealth.hospmedical.testsample.dao;


import cn.joinhealth.hospmedical.model.testsample.TestSample;
import cn.joinhealth.hospmedical.model.testsample.TestSampleReq;

import java.util.List;

public interface TestSampleMapper {
    List<TestSample> selectByParams(TestSampleReq testSampleReq);
}