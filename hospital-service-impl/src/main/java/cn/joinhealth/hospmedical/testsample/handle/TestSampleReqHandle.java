package cn.joinhealth.hospmedical.testsample.handle;

import cn.joinhealth.hospmedical.model.testsample.TestSampleReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class TestSampleReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: testSampleReq
     * @return: boolean
     */
    public static boolean validate(TestSampleReq testSampleReq) {
        if (!StringUtil.isEmpty(testSampleReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(testSampleReq.getPatIndexNo())
                || !StringUtil.isEmpty(testSampleReq.getOuthospNo())
                || !StringUtil.isEmpty(testSampleReq.getOuthospSerialNo())
                || !StringUtil.isEmpty(testSampleReq.getInhospNo())
                || !StringUtil.isEmpty(testSampleReq.getInhospSerialNo())
                || (testSampleReq.getRequisitionNo() != null && testSampleReq.getRequisitionNo().size() > 0)
                || (testSampleReq.getRequisitionNoItem() != null && testSampleReq.getRequisitionNoItem().size() > 0)) {
            return true;
        }
        return false;
    }
}
