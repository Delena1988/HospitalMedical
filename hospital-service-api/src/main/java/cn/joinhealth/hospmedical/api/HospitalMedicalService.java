package cn.joinhealth.hospmedical.api;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;

/**
 * Created by linjian
 * 16/11/2.
 */
public interface HospitalMedicalService {
    //科室字典
    ReplyMsg getDeptDict(RequestMsg requestMsg);

    //职工字典
    ReplyMsg getStaffDict(RequestMsg requestMsg);

    //疾病字典
    ReplyMsg getDiagDict(RequestMsg requestMsg);

    //卡号信息
//    ReplyMsg getCardNoInfo(RequestMsg requestMsg);

    //索引号信息
    ReplyMsg getIndexNoInfo(RequestMsg requestMsg);

    //患者基本信息
    ReplyMsg getPatientInfo(RequestMsg requestMsg);

    //就诊信息(门、急诊)
    ReplyMsg getVisitInfo(RequestMsg requestMsg);

    //处方信息
    ReplyMsg getOrderInfo(RequestMsg requestMsg);

    //处方明细信息
    ReplyMsg getOrderDetailInfo(RequestMsg requestMsg);

    //门诊费用
    ReplyMsg getOuthospFee(RequestMsg requestMsg);

    //门诊费用结算信息
    ReplyMsg getOuthospBalance(RequestMsg requestMsg);

    //门诊费用明细
    ReplyMsg getOuthospFeeDetail(RequestMsg requestMsg);

    //住院记录
    ReplyMsg getInhospRecord(RequestMsg requestMsg);

    //住院医嘱
    ReplyMsg getInhospOrder(RequestMsg requestMsg);

    //手术记录
    ReplyMsg getSurgeryRecord(RequestMsg requestMsg);

    //住院费用
    ReplyMsg getInhospFee(RequestMsg requestMsg);

    //住院费用结算信息
    ReplyMsg getInhospBalance(RequestMsg requestMsg);

    //住院费用明细
    ReplyMsg getInhospFeeDetail(RequestMsg requestMsg);

    //检查申请单
    ReplyMsg getExamRequisition(RequestMsg requestMsg);

    //检查报告
    ReplyMsg getExamReport(RequestMsg requestMsg);

    //检验申请单
    ReplyMsg getTestRequisition(RequestMsg requestMsg);

    //检验样本
    ReplyMsg getTestSample(RequestMsg requestMsg);

    //检验报告
    ReplyMsg getTestReport(RequestMsg requestMsg);

    //检验结果
    ReplyMsg getTestResult(RequestMsg requestMsg);

    //微生物检验结果
    ReplyMsg getMicrobeTestResult(RequestMsg requestMsg);

    //体检报告
    ReplyMsg getPhysicalExamReport(RequestMsg requestMsg);

    //体检结果
    ReplyMsg getPhysicalExamResult(RequestMsg requestMsg);

    //体征信息
    ReplyMsg getSigns(RequestMsg requestMsg);

    //签约病人信息
    ReplyMsg getSignedPatientInfo(RequestMsg requestMsg);

    //建档患者信息
    ReplyMsg getFilingPatient(RequestMsg requestMsg);
}
