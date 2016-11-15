package cn.joinhealth.hospmedical.testrequisition.dao;


import cn.joinhealth.hospmedical.model.testrequisition.TestRequisition;
import cn.joinhealth.hospmedical.model.testrequisition.TestRequisitionReq;

import java.util.List;

public interface TestRequisitionMapper {
    List<TestRequisition> selectByParams(TestRequisitionReq testRequisitionReq);
}