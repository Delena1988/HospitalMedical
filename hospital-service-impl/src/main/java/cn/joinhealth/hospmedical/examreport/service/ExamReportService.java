package cn.joinhealth.hospmedical.examreport.service;

import cn.joinhealth.hospmedical.model.examreport.ExamReport;
import cn.joinhealth.hospmedical.model.examreport.ExamReportReq;

import java.util.List;


/**
 * Created by linjian
 * 16/11/4.
 */
public interface ExamReportService {
    /**
     * @Description:查询检查报告
     * @param: [examReportReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.examreport.ExamReport>
     */
    List<ExamReport> selectByParams(ExamReportReq examReportReq);
}
