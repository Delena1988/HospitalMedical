package cn.joinhealth.service;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;
import cn.joinhealth.hospmedical.api.HospitalMedicalService;
import cn.joinhealth.hospmedical.cardnoinfo.service.CardNoInfoService;
import cn.joinhealth.hospmedical.deptdict.service.DeptDictService;
import cn.joinhealth.hospmedical.diagdict.service.DiagDictService;
import cn.joinhealth.hospmedical.examreport.service.ExamReportService;
import cn.joinhealth.hospmedical.examrequisition.service.ExamRequisitionService;
import cn.joinhealth.hospmedical.filingpatient.service.FilingPatientService;
import cn.joinhealth.hospmedical.inhospbalance.service.InhospBalanceService;
import cn.joinhealth.hospmedical.inhospfee.service.InhospFeeService;
import cn.joinhealth.hospmedical.inhospfeedetail.service.InhospFeeDetailService;
import cn.joinhealth.hospmedical.inhosporder.service.InhospOrderService;
import cn.joinhealth.hospmedical.inhosprecord.service.InhospRecordService;
import cn.joinhealth.hospmedical.microbetestresult.service.MicrobeTestResultService;
import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo;
import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfoReq;
import cn.joinhealth.hospmedical.model.deptdict.DeptDict;
import cn.joinhealth.hospmedical.model.diagdict.DiagDict;
import cn.joinhealth.hospmedical.model.examreport.ExamReport;
import cn.joinhealth.hospmedical.model.examreport.ExamReportReq;
import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisitionReq;
import cn.joinhealth.hospmedical.model.filingpatient.FilingPatient;
import cn.joinhealth.hospmedical.model.filingpatient.FilingPatientReq;
import cn.joinhealth.hospmedical.model.inhospbalance.InhospBalance;
import cn.joinhealth.hospmedical.model.inhospbalance.InhospBalanceReq;
import cn.joinhealth.hospmedical.model.inhospfee.InhospFee;
import cn.joinhealth.hospmedical.model.inhospfee.InhospFeeReq;
import cn.joinhealth.hospmedical.model.inhospfeedetail.InhospFeeDetail;
import cn.joinhealth.hospmedical.model.inhospfeedetail.InhospFeeDetailReq;
import cn.joinhealth.hospmedical.model.inhosporder.InhospOrder;
import cn.joinhealth.hospmedical.model.inhosporder.InhospOrderReq;
import cn.joinhealth.hospmedical.model.inhosprecord.InhospRecord;
import cn.joinhealth.hospmedical.model.inhosprecord.InhospRecordReq;
import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResult;
import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResultReq;
import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfo;
import cn.joinhealth.hospmedical.model.orderdetailinfo.OrderDetailInfoReq;
import cn.joinhealth.hospmedical.model.orderinfo.OrderInfo;
import cn.joinhealth.hospmedical.model.orderinfo.OrderInfoReq;
import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalance;
import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalanceReq;
import cn.joinhealth.hospmedical.model.outhospfee.OuthospFeeReq;
import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetail;
import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;
import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReport;
import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReportReq;
import cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResult;
import cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResultReq;
import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfo;
import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;
import cn.joinhealth.hospmedical.model.staffdict.StaffDict;
import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecord;
import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecordReq;
import cn.joinhealth.hospmedical.model.testreport.TestReport;
import cn.joinhealth.hospmedical.model.testreport.TestReportReq;
import cn.joinhealth.hospmedical.model.testrequisition.TestRequisition;
import cn.joinhealth.hospmedical.model.testrequisition.TestRequisitionReq;
import cn.joinhealth.hospmedical.model.testresult.TestResult;
import cn.joinhealth.hospmedical.model.testsample.TestSample;
import cn.joinhealth.hospmedical.model.testsample.TestSampleReq;
import cn.joinhealth.hospmedical.model.visitinfo.VisitInfo;
import cn.joinhealth.hospmedical.model.visitinfo.VisitInfoReq;
import cn.joinhealth.hospmedical.orderdetailinfo.service.OrderDetailInfoService;
import cn.joinhealth.hospmedical.orderinfo.service.OrderInfoService;
import cn.joinhealth.hospmedical.outhospbalance.service.OuthospBalanceService;
import cn.joinhealth.hospmedical.outhospfee.service.OuthospFeeService;
import cn.joinhealth.hospmedical.outhospfeedetail.service.OuthospFeeDetailService;
import cn.joinhealth.hospmedical.patientinfo.service.PatientInfoService;
import cn.joinhealth.hospmedical.physicalexamreport.service.PhysicalExamReportService;
import cn.joinhealth.hospmedical.physicalexamresult.service.PhysicalExamResultService;
import cn.joinhealth.hospmedical.signedpatientinfo.service.SignedPatientInfoService;
import cn.joinhealth.hospmedical.signs.service.SignsService;
import cn.joinhealth.hospmedical.staffdict.service.StaffDictService;
import cn.joinhealth.hospmedical.surgeryrecord.service.SurgeryRecordService;
import cn.joinhealth.hospmedical.testreport.service.TestReportService;
import cn.joinhealth.hospmedical.testrequisition.service.TestRequisitionService;
import cn.joinhealth.hospmedical.testsample.service.TestSampleService;
import cn.joinhealth.hospmedical.visitinfo.service.VisitInfoService;
import cn.joinhealth.pub_manager.utils.StringUtil;
import cn.joinhealth.util.MultipleDataSource;
import cn.joinhealth.util.PropertiesUtil;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisition;
import cn.joinhealth.hospmedical.model.outhospfee.OuthospFee;
import cn.joinhealth.hospmedical.model.patientinfo.PatientInfo;
import cn.joinhealth.hospmedical.model.patientinfo.PatientInfoReq;
import cn.joinhealth.hospmedical.model.signs.Signs;
import cn.joinhealth.hospmedical.model.signs.SignsReq;
import cn.joinhealth.hospmedical.model.testresult.TestResultReq;
import cn.joinhealth.hospmedical.testresult.service.TestResultService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by linjian
 * 16/11/2.
 */
public class HospitalMedicalServiceImpl implements HospitalMedicalService {
    @Autowired
    private DeptDictService deptDictService;
    @Autowired
    private StaffDictService staffDictService;
    @Autowired
    private DiagDictService diagDictService;
    @Autowired
    private CardNoInfoService cardNoInfoService;
    @Autowired
    private PatientInfoService patientInfoService;
    @Autowired
    private VisitInfoService visitInfoService;
    @Autowired
    private OrderInfoService orderInfoService;
    @Autowired
    private OrderDetailInfoService orderDetailInfoService;
    @Autowired
    private OuthospFeeService outhospFeeService;
    @Autowired
    private OuthospBalanceService outhospBalanceService;
    @Autowired
    private OuthospFeeDetailService outhospFeeDetailService;
    @Autowired
    private InhospRecordService inhospRecordService;
    @Autowired
    private InhospOrderService inhospOrderService;
    @Autowired
    private SurgeryRecordService surgeryRecordService;
    @Autowired
    private InhospFeeService inhospFeeService;
    @Autowired
    private InhospBalanceService inhospBalanceService;
    @Autowired
    private InhospFeeDetailService inhospFeeDetailService;
    @Autowired
    private ExamRequisitionService examRequisitionService;
    @Autowired
    private ExamReportService examReportService;
    @Autowired
    private TestRequisitionService testRequisitionService;
    @Autowired
    private TestSampleService testSampleService;
    @Autowired
    private TestReportService testReportService;
    @Autowired
    private TestResultService testResultService;
    @Autowired
    private MicrobeTestResultService microbeTestResultService;
    @Autowired
    private PhysicalExamReportService physicalExamReportService;
    @Autowired
    private PhysicalExamResultService physicalExamResultService;
    @Autowired
    private SignsService signsService;
    @Autowired
    private SignedPatientInfoService signedPatientInfoService;
    @Autowired
    private FilingPatientService filingPatientService;

    @Override
    public ReplyMsg getDeptDict(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getDeptDict"));
        List<DeptDict> deptDictList = deptDictService.selectAll();
        ReplyMsg replyMsg = new ReplyMsg();
        replyMsg.setBody(deptDictList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getStaffDict(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getStaffDict"));
        List<StaffDict> staffDictList = staffDictService.selectAll();
        ReplyMsg replyMsg = new ReplyMsg();
        replyMsg.setBody(staffDictList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getDiagDict(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getDiagDict"));
        List<DiagDict> diagDictList = diagDictService.selectAll();
        ReplyMsg replyMsg = new ReplyMsg();
        replyMsg.setBody(diagDictList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getIndexNoInfo(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getIndexNoInfo"));
        List<CardNoInfo> cardNoInfoList = null;
        ReplyMsg replyMsg = new ReplyMsg();
        CardNoInfoReq cardNoInfoReq = JSON.parseObject(requestMsg.getBody(), CardNoInfoReq.class);
        if (!StringUtil.isEmpty(cardNoInfoReq.getPatIndexNo())) {
            cardNoInfoList = cardNoInfoService.selectByPatIndexNo(cardNoInfoReq.getPatIndexNo());
        } else if (!StringUtil.isEmpty(cardNoInfoReq.getPatName())) {
            if (!StringUtil.isEmpty(cardNoInfoReq.getIdNumber())) {
                cardNoInfoList = cardNoInfoService.selectByIdNumberAndPatName(cardNoInfoReq);
            } else if (!StringUtil.isEmpty(cardNoInfoReq.getVisitCardNo())) {
                cardNoInfoList = cardNoInfoService.selectByCardNoAndPatName(cardNoInfoReq);
            }
        } else if (!StringUtil.isEmpty(cardNoInfoReq.getVisitCardType())) {
            cardNoInfoList = cardNoInfoService.selectByCardNoAndCardType(cardNoInfoReq);
            if (cardNoInfoList != null && cardNoInfoList.size() > 0 && !StringUtil.isEmpty(cardNoInfoList.get(0).getPatIndexNo())) {
                cardNoInfoList = cardNoInfoService.selectByPatIndexNo(cardNoInfoList.get(0).getPatIndexNo());
            }
        }
        replyMsg.setBody(cardNoInfoList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getPatientInfo(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPatientInfo"));
        List<PatientInfo> patientInfoList;
        ReplyMsg replyMsg = new ReplyMsg();
        PatientInfoReq patientInfoReq = JSON.parseObject(requestMsg.getBody(), PatientInfoReq.class);
        patientInfoList = patientInfoService.selectByParams(patientInfoReq);
        replyMsg.setBody(patientInfoList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getVisitInfo(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getVisitInfo"));
        List<VisitInfo> visitInfoList;
        Page<VisitInfo> visitInfoPage;
        ReplyMsg replyMsg = new ReplyMsg();
        VisitInfoReq visitInfoReq = JSON.parseObject(requestMsg.getBody(), VisitInfoReq.class);
        if (visitInfoReq.getPageFlag()) {
            PageHelper.startPage(visitInfoReq.getPageNum(), visitInfoReq.getPageSize());
            visitInfoPage = visitInfoService.selectByParamsPaged(visitInfoReq);
            replyMsg.setBody(visitInfoPage);
        } else {
            visitInfoList = visitInfoService.selectByParamsUnpaged(visitInfoReq);
            replyMsg.setBody(visitInfoList);
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getOrderInfo(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOrderInfo"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<OrderInfo> orderInfoList;
        OrderInfoReq orderInfoReq = JSON.parseObject(requestMsg.getBody(), OrderInfoReq.class);
        orderInfoList = orderInfoService.selectByParams(orderInfoReq);
        replyMsg.setBody(orderInfoList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getOrderDetailInfo(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOrderDetailInfo"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<OrderDetailInfo> orderDetailInfoList;
        OrderDetailInfoReq orderDetailInfoReq = JSON.parseObject(requestMsg.getBody(), OrderDetailInfoReq.class);
        orderDetailInfoList = orderDetailInfoService.selectByParams(orderDetailInfoReq);
        replyMsg.setBody(orderDetailInfoList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getOuthospFee(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOuthospFee"));
        ReplyMsg replyMsg = new ReplyMsg();
        OuthospFee outhospFee;
        OuthospFeeReq outhospFeeReq = JSON.parseObject(requestMsg.getBody(), OuthospFeeReq.class);
        outhospFee = outhospFeeService.selectByParams(outhospFeeReq);
        replyMsg.setBody(outhospFee);
        return replyMsg;
    }

    @Override
    public ReplyMsg getOuthospBalance(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOuthospBalance"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<OuthospBalance> outhospBalanceList;
        OuthospBalanceReq outhospBalanceReq = (OuthospBalanceReq) JSON.parse(requestMsg.getBody());
        outhospBalanceList = outhospBalanceService.selectByParams(outhospBalanceReq);
        replyMsg.setBody(outhospBalanceList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getOuthospFeeDetail(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOuthospFeeDetail"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<OuthospFeeDetail> outhospFeeDetailList;
        OuthospFeeDetailReq outhospFeeDetailReq = JSON.parseObject(requestMsg.getBody(), OuthospFeeDetailReq.class);
        outhospFeeDetailList = outhospFeeDetailService.selectByParams(outhospFeeDetailReq);
        replyMsg.setBody(outhospFeeDetailList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospRecord(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospRecord"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<InhospRecord> inhospRecordList;
        Page<InhospRecord> inhospRecordPage;
        InhospRecordReq inhospRecordReq = JSON.parseObject(requestMsg.getBody(), InhospRecordReq.class);
        if (inhospRecordReq.getPageFlag()) {
            PageHelper.startPage(inhospRecordReq.getPageNum(), inhospRecordReq.getPageSize());
            inhospRecordPage = inhospRecordService.selectByParamsPaged(inhospRecordReq);
            replyMsg.setBody(inhospRecordPage);
        } else {
            inhospRecordList = inhospRecordService.selectByParamsUnpaged(inhospRecordReq);
            replyMsg.setBody(inhospRecordList);
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospOrder(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospOrder"));
        ReplyMsg replyMsg = new ReplyMsg();
        Page<InhospOrder> inhospOrderList;
        InhospOrderReq inhospOrderReq = JSON.parseObject(requestMsg.getBody(), InhospOrderReq.class);
        PageHelper.startPage(inhospOrderReq.getPageNum(), inhospOrderReq.getPageSize());
        inhospOrderList = inhospOrderService.selectByParams(inhospOrderReq);
        replyMsg.setBody(inhospOrderList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getSurgeryRecord(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getSurgeryRecord"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<SurgeryRecord> surgeryRecordList;
        SurgeryRecordReq surgeryRecordReq = JSON.parseObject(requestMsg.getBody(), SurgeryRecordReq.class);
        surgeryRecordList = surgeryRecordService.selectByParams(surgeryRecordReq);
        replyMsg.setBody(surgeryRecordList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospFee(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospFee"));
        ReplyMsg replyMsg = new ReplyMsg();
        InhospFee inhospFee;
        InhospFeeReq inhospFeeReq = JSON.parseObject(requestMsg.getBody(), InhospFeeReq.class);
        inhospFee = inhospFeeService.selectByParams(inhospFeeReq);
        replyMsg.setBody(inhospFee);
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospBalance(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospBalance"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<InhospBalance> inhospBalanceList;
        InhospBalanceReq inhospBalanceReq = JSON.parseObject(requestMsg.getBody(), InhospBalanceReq.class);
        inhospBalanceList = inhospBalanceService.selectByParams(inhospBalanceReq);
        replyMsg.setBody(inhospBalanceList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospFeeDetail(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospFeeDetail"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<InhospFeeDetail> inhospFeeDetailList;
        InhospFeeDetailReq inhospFeeDetailReq = JSON.parseObject(requestMsg.getBody(), InhospFeeDetailReq.class);
        inhospFeeDetailList = inhospFeeDetailService.selectByParams(inhospFeeDetailReq);
        replyMsg.setBody(inhospFeeDetailList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getExamRequisition(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getExamRequisition"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<ExamRequisition> examRequisitionList;
        ExamRequisitionReq examRequisitionReq = JSON.parseObject(requestMsg.getBody(), ExamRequisitionReq.class);
        examRequisitionList = examRequisitionService.selectByParams(examRequisitionReq);
        replyMsg.setBody(examRequisitionList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getExamReport(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getExamReport"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<ExamReport> examReportList;
        ExamReportReq examReportReq = JSON.parseObject(requestMsg.getBody(), ExamReportReq.class);
        examReportList = examReportService.selectByParams(examReportReq);
        replyMsg.setBody(examReportList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getTestRequisition(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getTestRequisition"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<TestRequisition> testRequisitionList;
        TestRequisitionReq testRequisitionReq = JSON.parseObject(requestMsg.getBody(), TestRequisitionReq.class);
        testRequisitionList = testRequisitionService.selectByParams(testRequisitionReq);
        replyMsg.setBody(testRequisitionList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getTestSample(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getTestSample"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<TestSample> testSampleList;
        TestSampleReq testSampleReq = JSON.parseObject(requestMsg.getBody(), TestSampleReq.class);
        testSampleList = testSampleService.selectByParams(testSampleReq);
        replyMsg.setBody(testSampleList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getTestReport(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getTestReport"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<TestReport> testReportList;
        TestReportReq testReportReq = JSON.parseObject(requestMsg.getBody(), TestReportReq.class);
        testReportList = testReportService.selectByParams(testReportReq);
        replyMsg.setBody(testReportList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getTestResult(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getTestResult"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<TestResult> testResultList;
        TestResultReq testResultReq = JSON.parseObject(requestMsg.getBody(), TestResultReq.class);
        testResultList = testResultService.selectByParams(testResultReq);
        replyMsg.setBody(testResultList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getMicrobeTestResult(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getMicrobeTestResult"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<MicrobeTestResult> microbeTestResultList;
        MicrobeTestResultReq microbeTestResultReq = JSON.parseObject(requestMsg.getBody(), MicrobeTestResultReq.class);
        microbeTestResultList = microbeTestResultService.selectByParams(microbeTestResultReq);
        replyMsg.setBody(microbeTestResultList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getPhysicalExamReport(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPhysicalExamReport"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<PhysicalExamReport> physicalExamReportList;
        Page<PhysicalExamReport> physicalExamReportPage;
        PhysicalExamReportReq physicalExamReportReq = JSON.parseObject(requestMsg.getBody(), PhysicalExamReportReq.class);
        if (physicalExamReportReq.getPageFlag()) {
            physicalExamReportPage = physicalExamReportService.selectByParamsPaged(physicalExamReportReq);
            replyMsg.setBody(physicalExamReportPage);
        } else {
            physicalExamReportList = physicalExamReportService.selectByParamsUnpaged(physicalExamReportReq);
            replyMsg.setBody(physicalExamReportList);
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getPhysicalExamResult(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPhysicalExamResult"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<PhysicalExamResult> physicalExamResultList;
        PhysicalExamResultReq physicalExamResultReq = JSON.parseObject(requestMsg.getBody(), PhysicalExamResultReq.class);
        physicalExamResultList = physicalExamResultService.selectByParams(physicalExamResultReq);
        replyMsg.setBody(physicalExamResultList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getSigns(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getSigns"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<Signs> signsList;
        Page<Signs> signsPage;
        SignsReq signsReq = JSON.parseObject(requestMsg.getBody(), SignsReq.class);
        if (signsReq.getPageFlag()) {
            signsPage = signsService.selectByParamsPaged(signsReq);
            replyMsg.setBody(signsPage);
        } else {
            signsList = signsService.selectByParamsUnpaged(signsReq);
            replyMsg.setBody(signsList);
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getSignedPatientInfo(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getSignedPatientInfo"));
        ReplyMsg replyMsg = new ReplyMsg();
        Page<SignedPatientInfo> signedPatientInfoPage;
        SignedPatientInfoReq signedPatientInfoReq = JSON.parseObject(requestMsg.getBody(), SignedPatientInfoReq.class);
        signedPatientInfoPage = signedPatientInfoService.selectByParamsPaged(signedPatientInfoReq);
        replyMsg.setBody(signedPatientInfoPage);
        return replyMsg;
    }

    @Override
    public ReplyMsg getFilingPatient(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getFilingPatient"));
        ReplyMsg replyMsg = new ReplyMsg();
        Page<FilingPatient> filingPatientPage;
        List<FilingPatient> filingPatientList;
        FilingPatientReq filingPatientReq = JSON.parseObject(requestMsg.getBody(), FilingPatientReq.class);
        if (filingPatientReq.getPageFlag()){
            filingPatientPage = filingPatientService.selectByParamsPaged(filingPatientReq);
            replyMsg.setBody(filingPatientPage);
        }else{
            filingPatientList = filingPatientService.selectByParamsUnpaged(filingPatientReq);
            replyMsg.setBody(filingPatientList);
        }
        return replyMsg;
    }
}
