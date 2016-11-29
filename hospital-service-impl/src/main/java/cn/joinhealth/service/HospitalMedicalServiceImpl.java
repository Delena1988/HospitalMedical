package cn.joinhealth.service;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;
import cn.joinhealth.constant.Constant;
import cn.joinhealth.hospmedical.api.HospitalMedicalService;
import cn.joinhealth.hospmedical.cardnoinfo.handle.CardNoInfoReqHandle;
import cn.joinhealth.hospmedical.cardnoinfo.service.CardNoInfoService;
import cn.joinhealth.hospmedical.deptdict.handle.DeptDictReqHandle;
import cn.joinhealth.hospmedical.deptdict.service.DeptDictService;
import cn.joinhealth.hospmedical.diagdict.handle.DiagDictReqHandle;
import cn.joinhealth.hospmedical.diagdict.service.DiagDictService;
import cn.joinhealth.hospmedical.examreport.handle.ExamReportReqHandle;
import cn.joinhealth.hospmedical.examreport.service.ExamReportService;
import cn.joinhealth.hospmedical.examrequisition.handle.ExamRequisitionReqHandle;
import cn.joinhealth.hospmedical.examrequisition.service.ExamRequisitionService;
import cn.joinhealth.hospmedical.filingpatient.handle.FilingPatientReqHandle;
import cn.joinhealth.hospmedical.filingpatient.service.FilingPatientService;
import cn.joinhealth.hospmedical.inhospbalance.handle.InhospBalanceReqHandle;
import cn.joinhealth.hospmedical.inhospbalance.service.InhospBalanceService;
import cn.joinhealth.hospmedical.inhospfee.handle.InhospFeeReqHandle;
import cn.joinhealth.hospmedical.inhospfee.service.InhospFeeService;
import cn.joinhealth.hospmedical.inhospfeedetail.handle.InhospFeeDetailReqHandle;
import cn.joinhealth.hospmedical.inhospfeedetail.service.InhospFeeDetailService;
import cn.joinhealth.hospmedical.inhosporder.handle.InhospOrderReqHandle;
import cn.joinhealth.hospmedical.inhosporder.service.InhospOrderService;
import cn.joinhealth.hospmedical.inhosprecord.handle.InhospRecordReqHandle;
import cn.joinhealth.hospmedical.inhosprecord.service.InhospRecordService;
import cn.joinhealth.hospmedical.microbetestresult.handle.MicrobeTestResultReqHandle;
import cn.joinhealth.hospmedical.microbetestresult.service.MicrobeTestResultService;
import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo;
import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfoReq;
import cn.joinhealth.hospmedical.model.deptdict.DeptDict;
import cn.joinhealth.hospmedical.model.deptdict.DeptDictReq;
import cn.joinhealth.hospmedical.model.diagdict.DiagDict;
import cn.joinhealth.hospmedical.model.diagdict.DiagDictReq;
import cn.joinhealth.hospmedical.model.examreport.ExamReport;
import cn.joinhealth.hospmedical.model.examreport.ExamReportReq;
import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisition;
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
import cn.joinhealth.hospmedical.model.outhospfee.OuthospFee;
import cn.joinhealth.hospmedical.model.outhospfee.OuthospFeeReq;
import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetail;
import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;
import cn.joinhealth.hospmedical.model.patientinfo.PatientInfo;
import cn.joinhealth.hospmedical.model.patientinfo.PatientInfoReq;
import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReport;
import cn.joinhealth.hospmedical.model.physicalexamreport.PhysicalExamReportReq;
import cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResult;
import cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResultReq;
import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfo;
import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;
import cn.joinhealth.hospmedical.model.signs.Signs;
import cn.joinhealth.hospmedical.model.signs.SignsReq;
import cn.joinhealth.hospmedical.model.staffdict.StaffDict;
import cn.joinhealth.hospmedical.model.staffdict.StaffDictReq;
import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecord;
import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecordReq;
import cn.joinhealth.hospmedical.model.testreport.TestReport;
import cn.joinhealth.hospmedical.model.testreport.TestReportReq;
import cn.joinhealth.hospmedical.model.testrequisition.TestRequisition;
import cn.joinhealth.hospmedical.model.testrequisition.TestRequisitionReq;
import cn.joinhealth.hospmedical.model.testresult.TestResult;
import cn.joinhealth.hospmedical.model.testresult.TestResultReq;
import cn.joinhealth.hospmedical.model.testsample.TestSample;
import cn.joinhealth.hospmedical.model.testsample.TestSampleReq;
import cn.joinhealth.hospmedical.model.visitinfo.VisitInfo;
import cn.joinhealth.hospmedical.model.visitinfo.VisitInfoReq;
import cn.joinhealth.hospmedical.orderdetailinfo.handle.OrderDetailInfoReqHandle;
import cn.joinhealth.hospmedical.orderdetailinfo.service.OrderDetailInfoService;
import cn.joinhealth.hospmedical.orderinfo.handle.OrderInfoReqHandle;
import cn.joinhealth.hospmedical.orderinfo.service.OrderInfoService;
import cn.joinhealth.hospmedical.outhospbalance.handle.OuthospBalanceReqHandle;
import cn.joinhealth.hospmedical.outhospbalance.service.OuthospBalanceService;
import cn.joinhealth.hospmedical.outhospfee.handle.OuthospFeeReqHandle;
import cn.joinhealth.hospmedical.outhospfee.service.OuthospFeeService;
import cn.joinhealth.hospmedical.outhospfeedetail.handle.OuthospFeeDetailReqHandle;
import cn.joinhealth.hospmedical.outhospfeedetail.service.OuthospFeeDetailService;
import cn.joinhealth.hospmedical.patientinfo.handle.PatientInfoReqHandle;
import cn.joinhealth.hospmedical.patientinfo.service.PatientInfoService;
import cn.joinhealth.hospmedical.physicalexamreport.handle.PhysicalExamReportReqHandle;
import cn.joinhealth.hospmedical.physicalexamreport.service.PhysicalExamReportService;
import cn.joinhealth.hospmedical.physicalexamresult.handle.PhysicalExamResultReqHandle;
import cn.joinhealth.hospmedical.physicalexamresult.service.PhysicalExamResultService;
import cn.joinhealth.hospmedical.signedpatientinfo.handle.SignedPatientInfoReqHandle;
import cn.joinhealth.hospmedical.signedpatientinfo.service.SignedPatientInfoService;
import cn.joinhealth.hospmedical.signs.handle.SignsReqHandle;
import cn.joinhealth.hospmedical.signs.service.SignsService;
import cn.joinhealth.hospmedical.staffdict.handle.StaffDictReqHandle;
import cn.joinhealth.hospmedical.staffdict.service.StaffDictService;
import cn.joinhealth.hospmedical.surgeryrecord.handle.SurgeryRecordReqHandle;
import cn.joinhealth.hospmedical.surgeryrecord.service.SurgeryRecordService;
import cn.joinhealth.hospmedical.testreport.handle.TestReportReqHandle;
import cn.joinhealth.hospmedical.testreport.service.TestReportService;
import cn.joinhealth.hospmedical.testrequisition.handle.TestRequisitionReqHandle;
import cn.joinhealth.hospmedical.testrequisition.service.TestRequisitionService;
import cn.joinhealth.hospmedical.testresult.handle.TestResultReqHandle;
import cn.joinhealth.hospmedical.testresult.service.TestResultService;
import cn.joinhealth.hospmedical.testsample.handle.TestSampleReqHandle;
import cn.joinhealth.hospmedical.testsample.service.TestSampleService;
import cn.joinhealth.hospmedical.visitinfo.handle.VisitInfoReqHandle;
import cn.joinhealth.hospmedical.visitinfo.service.VisitInfoService;
import cn.joinhealth.pub_manager.utils.StringUtil;
import cn.joinhealth.util.DataSourceTypeUtil;
import cn.joinhealth.util.MultipleDataSource;
import cn.joinhealth.util.PropertiesUtil;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
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
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getDeptDict"));
        DeptDictReq deptDictReq = JSON.parseObject(requestMsg.getBody(), DeptDictReq.class);
        deptDictReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getDeptDict"));
        reqLogger.info("getIndexNoInfo req: " + JSON.toJSONString(deptDictReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!DeptDictReqHandle.validate(deptDictReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getDeptDict result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<DeptDict> deptDictList = deptDictService.selectAll(deptDictReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(deptDictList);
                reqLogger.info("getDeptDict result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getDeptDict exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getStaffDict(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getStaffDict"));
        StaffDictReq staffDictReq = JSON.parseObject(requestMsg.getBody(), StaffDictReq.class);
        staffDictReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getStaffDict"));
        reqLogger.info("getStaffDict req: " + JSON.toJSONString(staffDictReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!StaffDictReqHandle.validate(staffDictReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getStaffDict result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<StaffDict> staffDictList = staffDictService.selectAll();
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(staffDictList);
                reqLogger.info("getStaffDict result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getStaffDict exception: " + e.getMessage());
            }
        }

        return replyMsg;
    }

    @Override
    public ReplyMsg getDiagDict(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getDiagDict"));
        DiagDictReq diagDictReq = JSON.parseObject(requestMsg.getBody(), DiagDictReq.class);
        diagDictReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getDiagDict"));
        reqLogger.info("getIndexNoInfo req: " + JSON.toJSONString(diagDictReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!DiagDictReqHandle.validate(diagDictReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getDiagDict result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<DiagDict> diagDictList = diagDictService.selectAll(diagDictReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(diagDictList);
                reqLogger.info("getDiagDict result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getDiagDict exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getIndexNoInfo(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getIndexNoInfo"));
        CardNoInfoReq cardNoInfoReq = JSON.parseObject(requestMsg.getBody(), CardNoInfoReq.class);
        cardNoInfoReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getIndexNoInfo"));
        reqLogger.info("getIndexNoInfo req: " + JSON.toJSONString(cardNoInfoReq));
        ReplyMsg replyMsg = new ReplyMsg();
        List<CardNoInfo> cardNoInfoList = new ArrayList<>();
        if (!CardNoInfoReqHandle.validate(cardNoInfoReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getIndexNoInfo result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                if (!StringUtil.isEmpty(cardNoInfoReq.getPatIndexNo())) {
                    cardNoInfoList = cardNoInfoService.selectByPatIndexNo(cardNoInfoReq);
                } else if (!StringUtil.isEmpty(cardNoInfoReq.getPatName())) {
                    if (!StringUtil.isEmpty(cardNoInfoReq.getIdNumber())) {
                        cardNoInfoList = cardNoInfoService.selectByIdNumberAndPatName(cardNoInfoReq);
                    } else if (!StringUtil.isEmpty(cardNoInfoReq.getVisitCardNo())) {
                        cardNoInfoList = cardNoInfoService.selectByCardNoAndPatName(cardNoInfoReq);
                    }
                } else if (!StringUtil.isEmpty(cardNoInfoReq.getVisitCardType())) {
                    cardNoInfoList = cardNoInfoService.selectByCardNoAndCardType(cardNoInfoReq);
                    if (cardNoInfoList != null && cardNoInfoList.size() > 0 && !StringUtil.isEmpty(cardNoInfoList.get(0).getPatIndexNo())) {
                        cardNoInfoReq.setPatIndexNo(cardNoInfoList.get(0).getPatIndexNo());
                        cardNoInfoList = cardNoInfoService.selectByPatIndexNo(cardNoInfoReq);
                    }
                }
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(cardNoInfoList);
                reqLogger.info("getIndexNoInfo result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getIndexNoInfo exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getPatientInfo(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPatientInfo"));
        PatientInfoReq patientInfoReq = JSON.parseObject(requestMsg.getBody(), PatientInfoReq.class);
        patientInfoReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getPatientInfo"));
        reqLogger.info("getPatientInfo req: " + JSON.toJSONString(patientInfoReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!PatientInfoReqHandle.validate(patientInfoReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getPatientInfo result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<PatientInfo> patientInfoList = patientInfoService.selectByParams(patientInfoReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(patientInfoList);
                reqLogger.info("getPatientInfo result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getPatientInfo exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getVisitInfo(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getVisitInfo"));
        VisitInfoReq visitInfoReq = JSON.parseObject(requestMsg.getBody(), VisitInfoReq.class);
        visitInfoReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getVisitInfo"));
        reqLogger.info("getVisitInfo req: " + JSON.toJSONString(visitInfoReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!VisitInfoReqHandle.validate(visitInfoReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getVisitInfo result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                if (visitInfoReq.getPageFlag()) {
                    PageHelper.startPage(visitInfoReq.getPageNum(), visitInfoReq.getPageSize());
                    Page<VisitInfo> visitInfoPage = visitInfoService.selectByParamsPaged(visitInfoReq);
                    replyMsg.setBody(visitInfoPage);
                } else {
                    List<VisitInfo> visitInfoList = visitInfoService.selectByParamsUnpaged(visitInfoReq);
                    replyMsg.setBody(visitInfoList);
                }
                replyMsg.setRes(Constant.RES_SUCCESS);
                reqLogger.info("getVisitInfo result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getVisitInfo exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getOrderInfo(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOrderInfo"));
        OrderInfoReq orderInfoReq = JSON.parseObject(requestMsg.getBody(), OrderInfoReq.class);
        orderInfoReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getOrderInfo"));
        reqLogger.info("getOrderInfo req: " + JSON.toJSONString(orderInfoReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!OrderInfoReqHandle.validate(orderInfoReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getOrderInfo result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<OrderInfo> orderInfoList = orderInfoService.selectByParams(orderInfoReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(orderInfoList);
                reqLogger.info("getOrderInfo result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getOrderInfo exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getOrderDetailInfo(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOrderDetailInfo"));
        OrderDetailInfoReq orderDetailInfoReq = JSON.parseObject(requestMsg.getBody(), OrderDetailInfoReq.class);
        orderDetailInfoReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getOrderDetailInfo"));
        reqLogger.info("getOrderDetailInfo req: " + JSON.toJSONString(orderDetailInfoReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!OrderDetailInfoReqHandle.validate(orderDetailInfoReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getOrderDetailInfo result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<OrderDetailInfo> orderDetailInfoList = orderDetailInfoService.selectByParams(orderDetailInfoReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(orderDetailInfoList);
                reqLogger.info("getOrderDetailInfo result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getOrderDetailInfo exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getOuthospFee(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOuthospFee"));
        OuthospFeeReq outhospFeeReq = JSON.parseObject(requestMsg.getBody(), OuthospFeeReq.class);
        outhospFeeReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getOuthospFee"));
        reqLogger.info("getOrderInfo req: " + JSON.toJSONString(outhospFeeReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!OuthospFeeReqHandle.validate(outhospFeeReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getOuthospFee result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                OuthospFee outhospFee = outhospFeeService.selectByParams(outhospFeeReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(outhospFee);
                reqLogger.info("getOuthospFee result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getOuthospFee exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getOuthospBalance(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOuthospBalance"));
        OuthospBalanceReq outhospBalanceReq = JSON.parseObject(requestMsg.getBody(), OuthospBalanceReq.class);
        outhospBalanceReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getOuthospBalance"));
        reqLogger.info("getOuthospBalance req: " + JSON.toJSONString(outhospBalanceReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!OuthospBalanceReqHandle.validate(outhospBalanceReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getOuthospBalance result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<OuthospBalance> outhospBalanceList = outhospBalanceService.selectByParams(outhospBalanceReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(outhospBalanceList);
                reqLogger.info("getOuthospBalance result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getOuthospBalance exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getOuthospFeeDetail(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getOuthospFeeDetail"));
        OuthospFeeDetailReq outhospFeeDetailReq = JSON.parseObject(requestMsg.getBody(), OuthospFeeDetailReq.class);
        outhospFeeDetailReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getOuthospFeeDetail"));
        reqLogger.info("getOuthospFeeDetail req: " + JSON.toJSONString(outhospFeeDetailReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!OuthospFeeDetailReqHandle.validate(outhospFeeDetailReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getOuthospFeeDetail result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<OuthospFeeDetail> outhospFeeDetailList = outhospFeeDetailService.selectByParams(outhospFeeDetailReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(outhospFeeDetailList);
                reqLogger.info("getOuthospFeeDetail result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getOuthospFeeDetail exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospRecord(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospRecord"));
        InhospRecordReq inhospRecordReq = JSON.parseObject(requestMsg.getBody(), InhospRecordReq.class);
        inhospRecordReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getInhospRecord"));
        reqLogger.info("getInhospRecord req: " + JSON.toJSONString(inhospRecordReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!InhospRecordReqHandle.validate(inhospRecordReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getInhospRecord result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                if (inhospRecordReq.getPageFlag()) {
                    PageHelper.startPage(inhospRecordReq.getPageNum(), inhospRecordReq.getPageSize());
                    Page<InhospRecord> inhospRecordPage = inhospRecordService.selectByParamsPaged(inhospRecordReq);
                    replyMsg.setBody(inhospRecordPage);
                } else {
                    List<InhospRecord> inhospRecordList = inhospRecordService.selectByParamsUnpaged(inhospRecordReq);
                    replyMsg.setBody(inhospRecordList);
                }
                replyMsg.setRes(Constant.RES_SUCCESS);
                reqLogger.info("getInhospRecord result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getInhospRecord exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospOrder(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospOrder"));
        InhospOrderReq inhospOrderReq = JSON.parseObject(requestMsg.getBody(), InhospOrderReq.class);
        inhospOrderReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getInhospOrder"));
        reqLogger.info("getInhospOrder req: " + JSON.toJSONString(inhospOrderReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!InhospOrderReqHandle.validate(inhospOrderReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getInhospOrder result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                PageHelper.startPage(inhospOrderReq.getPageNum(), inhospOrderReq.getPageSize());
                Page<InhospOrder> inhospOrderList = inhospOrderService.selectByParams(inhospOrderReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(inhospOrderList);
                reqLogger.info("getInhospOrder result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getInhospOrder exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getSurgeryRecord(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getSurgeryRecord"));
        SurgeryRecordReq surgeryRecordReq = JSON.parseObject(requestMsg.getBody(), SurgeryRecordReq.class);
        surgeryRecordReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getSurgeryRecord"));
        reqLogger.info("getSurgeryRecord req: " + JSON.toJSONString(surgeryRecordReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!SurgeryRecordReqHandle.validate(surgeryRecordReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getSurgeryRecord result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<SurgeryRecord> surgeryRecordList = surgeryRecordService.selectByParams(surgeryRecordReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(surgeryRecordList);
                reqLogger.info("getSurgeryRecord result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getSurgeryRecord exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospFee(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospFee"));
        InhospFeeReq inhospFeeReq = JSON.parseObject(requestMsg.getBody(), InhospFeeReq.class);
        inhospFeeReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getInhospFee"));
        reqLogger.info("getInhospFee req: " + JSON.toJSONString(inhospFeeReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!InhospFeeReqHandle.validate(inhospFeeReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getInhospFee result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                InhospFee inhospFee = inhospFeeService.selectByParams(inhospFeeReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(inhospFee);
                reqLogger.info("getInhospFee result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getInhospFee exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospBalance(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospBalance"));
        InhospBalanceReq inhospBalanceReq = JSON.parseObject(requestMsg.getBody(), InhospBalanceReq.class);
        inhospBalanceReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getInhospBalance"));
        reqLogger.info("getInhospBalance req: " + JSON.toJSONString(inhospBalanceReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!InhospBalanceReqHandle.validate(inhospBalanceReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getInhospBalance result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<InhospBalance> inhospBalanceList = inhospBalanceService.selectByParams(inhospBalanceReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(inhospBalanceList);
                reqLogger.info("getInhospBalance result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getInhospBalance exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getInhospFeeDetail(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospFeeDetail"));
        InhospFeeDetailReq inhospFeeDetailReq = JSON.parseObject(requestMsg.getBody(), InhospFeeDetailReq.class);
        inhospFeeDetailReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getInhospFeeDetail"));
        reqLogger.info("getInhospFeeDetail req: " + JSON.toJSONString(inhospFeeDetailReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!InhospFeeDetailReqHandle.validate(inhospFeeDetailReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getInhospFeeDetail result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<InhospFeeDetail> inhospFeeDetailList = inhospFeeDetailService.selectByParams(inhospFeeDetailReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(inhospFeeDetailList);
                reqLogger.info("getInhospFeeDetail result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getInhospFeeDetail exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getExamRequisition(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getExamRequisition"));
        ExamRequisitionReq examRequisitionReq = JSON.parseObject(requestMsg.getBody(), ExamRequisitionReq.class);
        examRequisitionReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getExamRequisition"));
        reqLogger.info("getExamRequisition req: " + JSON.toJSONString(examRequisitionReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!ExamRequisitionReqHandle.validate(examRequisitionReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getExamRequisition result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<ExamRequisition> examRequisitionList = examRequisitionService.selectByParams(examRequisitionReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(examRequisitionList);
                reqLogger.info("getExamRequisition result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getExamRequisition exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getExamReport(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getExamReport"));
        ExamReportReq examReportReq = JSON.parseObject(requestMsg.getBody(), ExamReportReq.class);
        examReportReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getExamReport"));
        reqLogger.info("getExamReport req: " + JSON.toJSONString(examReportReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!ExamReportReqHandle.validate(examReportReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getExamReport result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<ExamReport> examReportList = examReportService.selectByParams(examReportReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(examReportList);
                reqLogger.info("getExamReport result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getExamReport exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getTestRequisition(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getTestRequisition"));
        TestRequisitionReq testRequisitionReq = JSON.parseObject(requestMsg.getBody(), TestRequisitionReq.class);
        testRequisitionReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getTestRequisition"));
        reqLogger.info("getTestRequisition req: " + JSON.toJSONString(testRequisitionReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!TestRequisitionReqHandle.validate(testRequisitionReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getTestRequisition result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<TestRequisition> testRequisitionList = testRequisitionService.selectByParams(testRequisitionReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(testRequisitionList);
                reqLogger.info("getTestRequisition result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getTestRequisition exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getTestSample(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getTestSample"));
        TestSampleReq testSampleReq = JSON.parseObject(requestMsg.getBody(), TestSampleReq.class);
        testSampleReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getTestSample"));
        reqLogger.info("getTestSample req: " + JSON.toJSONString(testSampleReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!TestSampleReqHandle.validate(testSampleReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getTestSample result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<TestSample> testSampleList = testSampleService.selectByParams(testSampleReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(testSampleList);
                reqLogger.info("getTestSample result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getTestSample exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getTestReport(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getTestReport"));
        TestReportReq testReportReq = JSON.parseObject(requestMsg.getBody(), TestReportReq.class);
        testReportReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getTestReport"));
        reqLogger.info("getTestReport req: " + JSON.toJSONString(testReportReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!TestReportReqHandle.validate(testReportReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getTestReport result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<TestReport> testReportList = testReportService.selectByParams(testReportReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(testReportList);
                reqLogger.info("getTestReport result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getTestReport exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getTestResult(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getTestResult"));
        TestResultReq testResultReq = JSON.parseObject(requestMsg.getBody(), TestResultReq.class);
        testResultReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getTestResult"));
        reqLogger.info("getTestResult req: " + JSON.toJSONString(testResultReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!TestResultReqHandle.validate(testResultReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getTestResult result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<TestResult> testResultList = testResultService.selectByParams(testResultReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(testResultList);
                reqLogger.info("getTestResult result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getTestResult exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getMicrobeTestResult(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getMicrobeTestResult"));
        MicrobeTestResultReq microbeTestResultReq = JSON.parseObject(requestMsg.getBody(), MicrobeTestResultReq.class);
        microbeTestResultReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getMicrobeTestResult"));
        reqLogger.info("getMicrobeTestResult req: " + JSON.toJSONString(microbeTestResultReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!MicrobeTestResultReqHandle.validate(microbeTestResultReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getMicrobeTestResult result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<MicrobeTestResult> microbeTestResultList = microbeTestResultService.selectByParams(microbeTestResultReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(microbeTestResultList);
                reqLogger.info("getMicrobeTestResult result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getMicrobeTestResult exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getPhysicalExamReport(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPhysicalExamReport"));
        PhysicalExamReportReq physicalExamReportReq = JSON.parseObject(requestMsg.getBody(), PhysicalExamReportReq.class);
        physicalExamReportReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getPhysicalExamReport"));
        reqLogger.info("getPhysicalExamReport req: " + JSON.toJSONString(physicalExamReportReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!PhysicalExamReportReqHandle.validate(physicalExamReportReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getPhysicalExamReport result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                if (physicalExamReportReq.getPageFlag()) {
                    Page<PhysicalExamReport> physicalExamReportPage = physicalExamReportService.selectByParamsPaged(physicalExamReportReq);
                    replyMsg.setBody(physicalExamReportPage);
                } else {
                    List<PhysicalExamReport> physicalExamReportList = physicalExamReportService.selectByParamsUnpaged(physicalExamReportReq);
                    replyMsg.setBody(physicalExamReportList);
                }
                replyMsg.setRes(Constant.RES_SUCCESS);
                reqLogger.info("getPhysicalExamReport result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getPhysicalExamReport exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getPhysicalExamResult(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPhysicalExamResult"));
        PhysicalExamResultReq physicalExamResultReq = JSON.parseObject(requestMsg.getBody(), PhysicalExamResultReq.class);
        physicalExamResultReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getPhysicalExamResult"));
        reqLogger.info("getPhysicalExamResult req: " + JSON.toJSONString(physicalExamResultReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!PhysicalExamResultReqHandle.validate(physicalExamResultReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getPhysicalExamResult result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<PhysicalExamResult> physicalExamResultList = physicalExamResultService.selectByParams(physicalExamResultReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(physicalExamResultList);
                reqLogger.info("getPhysicalExamResult result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getPhysicalExamResult exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getSigns(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getSigns"));
        SignsReq signsReq = JSON.parseObject(requestMsg.getBody(), SignsReq.class);
        signsReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getSigns"));
        reqLogger.info("getSigns req: " + JSON.toJSONString(signsReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!SignsReqHandle.validate(signsReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getSigns result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                if (signsReq.getPageFlag()) {
                    Page<Signs> signsPage = signsService.selectByParamsPaged(signsReq);
                    replyMsg.setBody(signsPage);
                } else {
                    List<Signs> signsList = signsService.selectByParamsUnpaged(signsReq);
                    replyMsg.setBody(signsList);
                }
                replyMsg.setRes(Constant.RES_SUCCESS);
                reqLogger.info("getSigns result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getSigns exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getSignedPatientInfo(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getSignedPatientInfo"));
        SignedPatientInfoReq signedPatientInfoReq = JSON.parseObject(requestMsg.getBody(), SignedPatientInfoReq.class);
        signedPatientInfoReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getSignedPatientInfo"));
        reqLogger.info("getSignedPatientInfo req: " + JSON.toJSONString(signedPatientInfoReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!SignedPatientInfoReqHandle.validate(signedPatientInfoReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getSignedPatientInfo result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                Page<SignedPatientInfo> signedPatientInfoPage = signedPatientInfoService.selectByParamsPaged(signedPatientInfoReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(signedPatientInfoPage);
                reqLogger.info("getSignedPatientInfo result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getSignedPatientInfo exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getFilingPatient(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(HospitalMedicalService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getFilingPatient"));
        FilingPatientReq filingPatientReq = JSON.parseObject(requestMsg.getBody(), FilingPatientReq.class);
        filingPatientReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getFilingPatient"));
        reqLogger.info("getFilingPatient req: " + JSON.toJSONString(filingPatientReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!FilingPatientReqHandle.validate(filingPatientReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getFilingPatient result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                if (filingPatientReq.getPageFlag()) {
                    Page<FilingPatient> filingPatientPage = filingPatientService.selectByParamsPaged(filingPatientReq);
                    replyMsg.setBody(filingPatientPage);
                } else {
                    List<FilingPatient> filingPatientList = filingPatientService.selectByParamsUnpaged(filingPatientReq);
                    replyMsg.setBody(filingPatientList);
                }
                replyMsg.setRes(Constant.RES_SUCCESS);
                reqLogger.info("getFilingPatient result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setBody(e.getMessage());
                errorLogger.error("getFilingPatient exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }
}
