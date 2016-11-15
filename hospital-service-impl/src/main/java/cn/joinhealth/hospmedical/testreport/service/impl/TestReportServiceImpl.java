package cn.joinhealth.hospmedical.testreport.service.impl;

import cn.joinhealth.hospmedical.model.testreport.TestReport;
import cn.joinhealth.hospmedical.testreport.dao.TestReportMapper;
import cn.joinhealth.hospmedical.testreport.service.TestReportService;
import cn.joinhealth.hospmedical.model.testreport.TestReportReq;
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
