package cn.joinhealth.hospmedical.api;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;

/**
 * Created by linjian
 * 16/11/15
 * 医疗信息相关接口
 */
public interface HospitalMedicalService {
    /**
    * @Description:科室字典
    * @param:RequestMsg
    * @return:ReplyMsg
    */
    ReplyMsg getDeptDict(RequestMsg requestMsg);

    /**
    * @Description:职工字典
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getStaffDict(RequestMsg requestMsg);

    /**
    * @Description:疾病字典
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getDiagDict(RequestMsg requestMsg);

    /**
    * @Description:卡号信息
    * @param: RequestMsg
    * @return: ReplyMsg
    */
//    ReplyMsg getCardNoInfo(RequestMsg requestMsg);

    /**
    * @Description:索引号信息
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getIndexNoInfo(RequestMsg requestMsg);

    /**
    * @Description:患者基本信息
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getPatientInfo(RequestMsg requestMsg);

    /**
    * @Description:就诊信息(门、急诊)
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getVisitInfo(RequestMsg requestMsg);

    /**
    * @Description: 处方信息
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getOrderInfo(RequestMsg requestMsg);

    /**
    * @Description:处方明细信息
    * @param: RequestMsg
    * @return:ReplyMsg
    */
    ReplyMsg getOrderDetailInfo(RequestMsg requestMsg);

    /**
    * @Description:门诊费用
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getOuthospFee(RequestMsg requestMsg);

    /**
    * @Description:门诊费用结算信息
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getOuthospBalance(RequestMsg requestMsg);

    /**
    * @Description:门诊费用明细
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getOuthospFeeDetail(RequestMsg requestMsg);

    /**
    * @Description:住院记录
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getInhospRecord(RequestMsg requestMsg);

    //住院医嘱
    /**
    * @Description:
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getInhospOrder(RequestMsg requestMsg);

    /**
     * @Description:手术记录
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getSurgeryRecord(RequestMsg requestMsg);

    /**
     * @Description:住院费用
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getInhospFee(RequestMsg requestMsg);

    /**
     * @Description:住院费用结算信息
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getInhospBalance(RequestMsg requestMsg);

    /**
     * @Description:住院费用明细
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getInhospFeeDetail(RequestMsg requestMsg);

    /**
     * @Description:检查申请单
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getExamRequisition(RequestMsg requestMsg);

    /**
     * @Description:检查报告
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getExamReport(RequestMsg requestMsg);

    /**
     * @Description:检验申请单
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getTestRequisition(RequestMsg requestMsg);

    /**
     * @Description:检验样本
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getTestSample(RequestMsg requestMsg);

    /**
     * @Description:检验报告
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getTestReport(RequestMsg requestMsg);

    /**
     * @Description:检验结果
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getTestResult(RequestMsg requestMsg);

    /**
     * @Description:微生物检验结果
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getMicrobeTestResult(RequestMsg requestMsg);

    /**
     * @Description:体检报告
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getPhysicalExamReport(RequestMsg requestMsg);

    /**
     * @Description:体检结果
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getPhysicalExamResult(RequestMsg requestMsg);

    /**
     * @Description:体征信息
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getSigns(RequestMsg requestMsg);

    /**
     * @Description:签约病人信息
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getSignedPatientInfo(RequestMsg requestMsg);

    /**
     * @Description:建档患者信息
     * @param: RequestMsg
     * @return: ReplyMsg
     */
    ReplyMsg getFilingPatient(RequestMsg requestMsg);
}
