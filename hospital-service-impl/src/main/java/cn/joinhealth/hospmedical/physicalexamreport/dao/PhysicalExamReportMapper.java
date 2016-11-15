package cn.joinhealth.hospmedical.physicalexamreport.dao;


import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReport;
import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReportReq;
import com.github.pagehelper.Page;

import java.util.List;

public interface PhysicalExamReportMapper {
    List<PhysicalExamReport> selectByParamsUnpaged(PhysicalExamReportReq physicalExamReportReq);
    Page<PhysicalExamReport> selectByParamsPaged(PhysicalExamReportReq physicalExamReportReq);
}