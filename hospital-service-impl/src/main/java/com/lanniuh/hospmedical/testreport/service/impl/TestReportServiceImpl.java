package com.lanniuh.hospmedical.testreport.service.impl;

import com.lanniuh.hospmedical.model.testreport.TestReport;
import com.lanniuh.hospmedical.model.testreport.TestReportReq;
import com.lanniuh.hospmedical.testreport.dao.TestReportMapper;
import com.lanniuh.hospmedical.testreport.service.TestReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "testReportService")
public class TestReportServiceImpl implements TestReportService {
    @Autowired
    private TestReportMapper testReportMapper;

    @Override
    public List<TestReport> selectByParams(TestReportReq testReportReq) {
        return testReportMapper.selectByParams(testReportReq);
    }
}
