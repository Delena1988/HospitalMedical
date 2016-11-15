package cn.joinhealth.hospmedical.testreport.dao;


import cn.joinhealth.hospmedical.model.testreport.TestReport;
import cn.joinhealth.hospmedical.model.testreport.TestReportReq;

import java.util.List;

public interface TestReportMapper {
    List<TestReport> selectByParams(TestReportReq testReportReq);
}