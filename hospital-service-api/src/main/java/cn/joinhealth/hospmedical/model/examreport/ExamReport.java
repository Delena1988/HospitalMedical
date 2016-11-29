package cn.joinhealth.hospmedical.model.examreport;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 检查报告
 */
public class ExamReport implements Serializable {
    private static final long serialVersionUID = 2890065528661930901L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospNum;//住院次数
    private String inhospSerialNo;//住院流水号
    private String requisitionNo;//申请单编号
    private String reportNo;//报告单编号
    private String reportName;//报告名称
    private String equipmentCode;//设备代码
    private String equipmentName;//设备名称
    private String operPartCode;//操作部位代码
    private String operPartName;//操作部位名称
    private String examCategCode;//检查类别代码
    private String examCategName;//检查类别名称
    private String examItemCode;//检查项目代码
    private String examItemName;//检查项目名称
    private String applyDate;//申请日期
    private String applyDeptCode;//申请科室代码
    private String applyDeptName;//申请科室名称
    private String applyDrCode;//申请医生工号
    private String applyDrName;//申请医生姓名
    private String executeDate;//执行日期
    private String picture;//图片（jpg）内网
    private String pictureWeb;//图片（jpg）外网
    private String examResult;//检查结果（客观所见）
    private String examDescription;//检查描述（主观提示）
    private String reportDate;//报告日期
    private String note;//备注

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo;
    }

    public String getOuthospNo() {
        return outhospNo;
    }

    public void setOuthospNo(String outhospNo) {
        this.outhospNo = outhospNo;
    }

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo;
    }

    public String getInhospNo() {
        return inhospNo;
    }

    public void setInhospNo(String inhospNo) {
        this.inhospNo = inhospNo;
    }

    public String getInhospNum() {
        return inhospNum;
    }

    public void setInhospNum(String inhospNum) {
        this.inhospNum = inhospNum;
    }

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo;
    }

    public String getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(String requisitionNo) {
        this.requisitionNo = requisitionNo;
    }

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getOperPartCode() {
        return operPartCode;
    }

    public void setOperPartCode(String operPartCode) {
        this.operPartCode = operPartCode;
    }

    public String getOperPartName() {
        return operPartName;
    }

    public void setOperPartName(String operPartName) {
        this.operPartName = operPartName;
    }

    public String getExamCategCode() {
        return examCategCode;
    }

    public void setExamCategCode(String examCategCode) {
        this.examCategCode = examCategCode;
    }

    public String getExamCategName() {
        return examCategName;
    }

    public void setExamCategName(String examCategName) {
        this.examCategName = examCategName;
    }

    public String getExamItemCode() {
        return examItemCode;
    }

    public void setExamItemCode(String examItemCode) {
        this.examItemCode = examItemCode;
    }

    public String getExamItemName() {
        return examItemName;
    }

    public void setExamItemName(String examItemName) {
        this.examItemName = examItemName;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode;
    }

    public String getApplyDeptName() {
        return applyDeptName;
    }

    public void setApplyDeptName(String applyDeptName) {
        this.applyDeptName = applyDeptName;
    }

    public String getApplyDrCode() {
        return applyDrCode;
    }

    public void setApplyDrCode(String applyDrCode) {
        this.applyDrCode = applyDrCode;
    }

    public String getApplyDrName() {
        return applyDrName;
    }

    public void setApplyDrName(String applyDrName) {
        this.applyDrName = applyDrName;
    }

    public String getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(String executeDate) {
        this.executeDate = executeDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPictureWeb() {
        return pictureWeb;
    }

    public void setPictureWeb(String pictureWeb) {
        this.pictureWeb = pictureWeb;
    }

    public String getExamResult() {
        return examResult;
    }

    public void setExamResult(String examResult) {
        this.examResult = examResult;
    }

    public String getExamDescription() {
        return examDescription;
    }

    public void setExamDescription(String examDescription) {
        this.examDescription = examDescription;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ExamReport{" +
                "organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", requisitionNo='" + requisitionNo + '\'' +
                ", reportNo='" + reportNo + '\'' +
                ", reportName='" + reportName + '\'' +
                ", equipmentCode='" + equipmentCode + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", operPartCode='" + operPartCode + '\'' +
                ", operPartName='" + operPartName + '\'' +
                ", examCategCode='" + examCategCode + '\'' +
                ", examCategName='" + examCategName + '\'' +
                ", examItemCode='" + examItemCode + '\'' +
                ", examItemName='" + examItemName + '\'' +
                ", applyDate='" + applyDate + '\'' +
                ", applyDeptCode='" + applyDeptCode + '\'' +
                ", applyDeptName='" + applyDeptName + '\'' +
                ", applyDrCode='" + applyDrCode + '\'' +
                ", applyDrName='" + applyDrName + '\'' +
                ", executeDate='" + executeDate + '\'' +
                ", picture='" + picture + '\'' +
                ", pictureWeb='" + pictureWeb + '\'' +
                ", examResult='" + examResult + '\'' +
                ", examDescription='" + examDescription + '\'' +
                ", reportDate='" + reportDate + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}