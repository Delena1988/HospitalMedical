package com.lanniuh.hospmedical.examreport.service.impl;

import com.lanniuh.hospmedical.examreport.dao.ExamReportMapper;
import com.lanniuh.hospmedical.examreport.service.ExamReportService;
import com.lanniuh.hospmedical.model.examreport.ExamReport;
import com.lanniuh.hospmedical.model.examreport.ExamReportReq;
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
