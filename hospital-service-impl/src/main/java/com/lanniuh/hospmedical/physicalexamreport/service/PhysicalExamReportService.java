package com.lanniuh.hospmedical.physicalexamreport.service;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.physicalexamreport.PhysicalExamReport;
import com.lanniuh.hospmedical.model.physicalexamreport.PhysicalExamReportReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamReportService {
    List<PhysicalExamReport> selectByParamsUnpaged(PhysicalExamReportReq physicalExamReportReq);
    Page<PhysicalExamReport> selectByParamsPaged(PhysicalExamReportReq physicalExamReportReq);
}
