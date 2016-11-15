package cn.joinhealth.hospmedical.examreport.dao;


import cn.joinhealth.hospmedical.model.examreport.ExamReport;
import cn.joinhealth.hospmedical.model.examreport.ExamReportReq;

import java.util.List;

public interface ExamReportMapper {
    List<ExamReport> selectByParams(ExamReportReq examReportReq);
}