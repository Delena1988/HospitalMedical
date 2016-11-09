package com.lanniuh.hospmedical.physicalexamreport.dao;


import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.physicalexamreport.PhysicalExamReport;
import com.lanniuh.hospmedical.model.physicalexamreport.PhysicalExamReportReq;

import java.util.List;

public interface PhysicalExamReportMapper {
    List<PhysicalExamReport> selectByParamsUnpaged(PhysicalExamReportReq physicalExamReportReq);
    Page<PhysicalExamReport> selectByParamsPaged(PhysicalExamReportReq physicalExamReportReq);
}