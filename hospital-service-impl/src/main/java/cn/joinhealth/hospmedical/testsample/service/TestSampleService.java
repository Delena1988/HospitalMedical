package cn.joinhealth.hospmedical.testsample.service;

import cn.joinhealth.hospmedical.model.testsample.TestSample;
import cn.joinhealth.hospmedical.model.testsample.TestSampleReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface TestSampleService {
    /**
     * @Description:查询检验样本信息
     * @param: [testSampleReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.testsample.TestSample>
     */
    List<TestSample> selectByParams(TestSampleReq testSampleReq);
}
