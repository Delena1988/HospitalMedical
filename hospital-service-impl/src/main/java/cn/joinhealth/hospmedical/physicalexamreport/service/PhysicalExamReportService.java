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
    /**
     * @Description:查询体检报告 不分页
     * @param: [physicalExamReportReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReport>
     */
    List<PhysicalExamReport> selectByParamsUnpaged(PhysicalExamReportReq physicalExamReportReq);

    /**
     * @Description:查询体检报告 分页
     * @param: [physicalExamReportReq]
     * @return: com.github.pagehelper.Page<cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReport>
     */
    Page<PhysicalExamReport> selectByParamsPaged(PhysicalExamReportReq physicalExamReportReq);
}
