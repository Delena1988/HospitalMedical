package cn.joinhealth.hospmedical.testrequisition.handle;

import cn.joinhealth.hospmedical.model.testrequisition.TestRequisitionReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class TestRequisitionReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: testRequisitionReq
     * @return: boolean
     */
    public static boolean validate(TestRequisitionReq testRequisitionReq) {
        if (!StringUtil.isEmpty(testRequisitionReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(testRequisitionReq.getOuthospSerialNo())
                || !StringUtil.isEmpty(testRequisitionReq.getInhospSerialNo())) {
            return true;
        }
        return false;
    }
}
