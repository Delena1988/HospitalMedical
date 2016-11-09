package com.lanniuh.hospmedical.testrequisition.service;

import com.lanniuh.hospmedical.model.testrequisition.TestRequisition;
import com.lanniuh.hospmedical.model.testrequisition.TestRequisitionReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface TestRequisitionService {
    List<TestRequisition> selectByParams(TestRequisitionReq testRequisitionReq);
}
