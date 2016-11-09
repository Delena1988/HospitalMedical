package com.lanniuh.hospmedical.examreport.service;

import com.lanniuh.hospmedical.model.examreport.ExamReport;
import com.lanniuh.hospmedical.model.examreport.ExamReportReq;

import java.util.List;


/**
 * Created by linjian
 * 16/11/4.
 */
public interface ExamReportService {
    List<ExamReport> selectByParams(ExamReportReq examReportReq);
}
