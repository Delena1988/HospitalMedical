package cn.joinhealth.hospmedical.testsample.service.impl;

import cn.joinhealth.hospmedical.testsample.service.TestSampleService;
import cn.joinhealth.hospmedical.model.testsample.TestSample;
import cn.joinhealth.hospmedical.model.testsample.TestSampleReq;
import cn.joinhealth.hospmedical.testsample.dao.TestSampleMapper;
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
