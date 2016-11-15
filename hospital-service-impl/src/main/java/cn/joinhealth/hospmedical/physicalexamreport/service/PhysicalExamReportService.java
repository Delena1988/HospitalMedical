package cn.joinhealth.hospmedical.physicalexamreport.service;

import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReport;
import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReportReq;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamReportService {
    List<PhysicalExamReport> selectByParamsUnpaged(PhysicalExamReportReq physicalExamReportReq);
    Page<PhysicalExamReport> selectByParamsPaged(PhysicalExamReportReq physicalExamReportReq);
}
