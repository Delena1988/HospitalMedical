package cn.joinhealth.hospmedical.testrequisition.service.impl;

import cn.joinhealth.hospmedical.model.testrequisition.TestRequisition;
import cn.joinhealth.hospmedical.model.testrequisition.TestRequisitionReq;
import cn.joinhealth.hospmedical.testrequisition.dao.TestRequisitionMapper;
import cn.joinhealth.hospmedical.testrequisition.service.TestRequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "testRequisitionService")
public class TestRequisitionServiceImpl implements TestRequisitionService {
    @Autowired
    private TestRequisitionMapper testRequisitionMapper;

    @Override
    public List<TestRequisition> selectByParams(TestRequisitionReq testRequisitionReq) {
        return testRequisitionMapper.selectByParams(testRequisitionReq);
    }
}
