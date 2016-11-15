package cn.joinhealth.hospmedical.examreport.service.impl;

import cn.joinhealth.hospmedical.examreport.service.ExamReportService;
import cn.joinhealth.hospmedical.model.examreport.ExamReportReq;
import cn.joinhealth.hospmedical.examreport.dao.ExamReportMapper;
import cn.joinhealth.hospmedical.model.examreport.ExamReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "examReportService")
public class ExamReportServiceImpl implements ExamReportService {
    @Autowired
    private ExamReportMapper examReportMapper;

    @Override
    public List<ExamReport> selectByParams(ExamReportReq examReportReq) {
        return examReportMapper.selectByParams(examReportReq);
    }
}
