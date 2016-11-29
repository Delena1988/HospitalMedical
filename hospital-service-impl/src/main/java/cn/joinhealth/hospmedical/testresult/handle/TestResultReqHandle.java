package cn.joinhealth.hospmedical.testresult.handle;

import cn.joinhealth.hospmedical.model.testresult.TestResultReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class TestResultReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: testResultReq
     * @return: boolean
     */
    public static boolean validate(TestResultReq testResultReq) {
        if (!StringUtil.isEmpty(testResultReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(testResultReq.getReportNo())) {
            return true;
        }
        return false;
    }
}
