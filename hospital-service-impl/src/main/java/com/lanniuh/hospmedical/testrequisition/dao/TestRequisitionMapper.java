package com.lanniuh.hospmedical.testrequisition.dao;


import com.lanniuh.hospmedical.model.testrequisition.TestRequisition;
import com.lanniuh.hospmedical.model.testrequisition.TestRequisitionReq;

import java.util.List;

public interface TestRequisitionMapper {
    List<TestRequisition> selectByParams(TestRequisitionReq testRequisitionReq);
}