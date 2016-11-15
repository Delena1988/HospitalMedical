package cn.joinhealth.hospmedical.physicalexamreport.service.impl;

import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReportReq;
import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReport;
import cn.joinhealth.hospmedical.physicalexamreport.dao.PhysicalExamReportMapper;
import cn.joinhealth.hospmedical.physicalexamreport.service.PhysicalExamReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "physicalExamReportService")
public class PhysicalExamReportServiceImpl implements PhysicalExamReportService {
    @Autowired
    private PhysicalExamReportMapper physicalExamReportMapper;

    @Override
    public List<PhysicalExamReport> selectByParamsUnpaged(PhysicalExamReportReq physicalExamReportReq) {
        return physicalExamReportMapper.selectByParamsUnpaged(physicalExamReportReq);
    }

    @Override
    public Page<PhysicalExamReport> selectByParamsPaged(PhysicalExamReportReq physicalExamReportReq) {
        return physicalExamReportMapper.selectByParamsPaged(physicalExamReportReq);
    }
}
