package com.lanniuh.hospmedical.testreport.dao;


import com.lanniuh.hospmedical.model.testreport.TestReport;
import com.lanniuh.hospmedical.model.testreport.TestReportReq;

import java.util.List;

public interface TestReportMapper {
    List<TestReport> selectByParams(TestReportReq testReportReq);
}