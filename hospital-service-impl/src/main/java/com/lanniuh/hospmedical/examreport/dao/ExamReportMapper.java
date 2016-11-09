package com.lanniuh.hospmedical.examreport.dao;


import com.lanniuh.hospmedical.model.examreport.ExamReport;
import com.lanniuh.hospmedical.model.examreport.ExamReportReq;

import java.util.List;

public interface ExamReportMapper {
    List<ExamReport> selectByParams(ExamReportReq examReportReq);
}