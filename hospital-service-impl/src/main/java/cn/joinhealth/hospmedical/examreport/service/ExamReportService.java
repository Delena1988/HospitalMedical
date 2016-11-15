package cn.joinhealth.hospmedical.examreport.service;

import cn.joinhealth.hospmedical.model.examreport.ExamReport;
import cn.joinhealth.hospmedical.model.examreport.ExamReportReq;

import java.util.List;


/**
 * Created by linjian
 * 16/11/4.
 */
public interface ExamReportService {
    List<ExamReport> selectByParams(ExamReportReq examReportReq);
}
