package cn.joinhealth.hospmedical.testsample.service;

import cn.joinhealth.hospmedical.model.testsample.TestSample;
import cn.joinhealth.hospmedical.model.testsample.TestSampleReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface TestSampleService {
    List<TestSample> selectByParams(TestSampleReq testSampleReq);
}
