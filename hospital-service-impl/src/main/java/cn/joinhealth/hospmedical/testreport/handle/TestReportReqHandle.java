package cn.joinhealth.hospmedical.testreport.handle;

import cn.joinhealth.hospmedical.model.testreport.TestReportReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class TestReportReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: testReportReq
     * @return: boolean
     */
    public static boolean validate(TestReportReq testReportReq) {
        if (!StringUtil.isEmpty(testReportReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(testReportReq.getPatIndexNo())
                || !StringUtil.isEmpty(testReportReq.getOuthospNo())
                || !StringUtil.isEmpty(testReportReq.getOuthospSerialNo())
                || !StringUtil.isEmpty(testReportReq.getInhospNo())
                || !StringUtil.isEmpty(testReportReq.getInhospSerialNo())
                || !StringUtil.isEmpty(testReportReq.getRequisitionNo())
                || !StringUtil.isEmpty(testReportReq.getRequisitionNoItem())
                || !StringUtil.isEmpty(testReportReq.getApplyDrName())
                || !StringUtil.isEmpty(testReportReq.getApplyDeptName())
                || (testReportReq.getBarcodeNo() != null && testReportReq.getBarcodeNo().size() > 0)) {
            return true;
        }
        return false;
    }
}
