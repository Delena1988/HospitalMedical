package cn.joinhealth.hospmedical.testrequisition.service;

import cn.joinhealth.hospmedical.model.testrequisition.TestRequisition;
import cn.joinhealth.hospmedical.model.testrequisition.TestRequisitionReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface TestRequisitionService {
    /**
     * @Description:查询检验申请单
     * @param: [testRequisitionReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.testrequisition.TestRequisition>
     */
    List<TestRequisition> selectByParams(TestRequisitionReq testRequisitionReq);
}
