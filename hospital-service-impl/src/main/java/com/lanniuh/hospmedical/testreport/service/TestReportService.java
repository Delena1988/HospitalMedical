package com.lanniuh.hospmedical.testreport.service;

import com.lanniuh.hospmedical.model.testreport.TestReport;
import com.lanniuh.hospmedical.model.testreport.TestReportReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface TestReportService {
    List<TestReport> selectByParams(TestReportReq testReportReq);
}
