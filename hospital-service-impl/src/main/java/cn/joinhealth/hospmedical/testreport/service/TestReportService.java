package cn.joinhealth.hospmedical.testreport.service;

import cn.joinhealth.hospmedical.model.testreport.TestReport;
import cn.joinhealth.hospmedical.model.testreport.TestReportReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface TestReportService {
    /**
     * @Description:查询检验报告
     * @param: [testReportReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.testreport.TestReport>
     */
    List<TestReport> selectByParams(TestReportReq testReportReq);
}
