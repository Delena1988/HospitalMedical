package cn.joinhealth.hospmedical.model.examreport;

import java.io.Serializable;

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
    private String picture;//图片（jpg）
    private String examResult;//检查结果（客观所见）
    private String examDescription;//检查描述（主观提示）
    private String reportDate;//报告日期
    private String note;//备注

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo == null ? null : patIndexNo.trim();
    }

    public String getOuthospNo() {
        return outhospNo;
    }

    public void setOuthospNo(String outhospNo) {
        this.outhospNo = outhospNo == null ? null : outhospNo.trim();
    }

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo == null ? null : outhospSerialNo.trim();
    }

    public String getInhospNo() {
        return inhospNo;
    }

    public void setInhospNo(String inhospNo) {
        this.inhospNo = inhospNo == null ? null : inhospNo.trim();
    }

    public String getInhospNum() {
        return inhospNum;
    }

    public void setInhospNum(String inhospNum) {
        this.inhospNum = inhospNum == null ? null : inhospNum.trim();
    }

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo == null ? null : inhospSerialNo.trim();
    }

    public String getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(String requisitionNo) {
        this.requisitionNo = requisitionNo == null ? null : requisitionNo.trim();
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName == null ? null : reportName.trim();
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode == null ? null : equipmentCode.trim();
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getOperPartCode() {
        return operPartCode;
    }

    public void setOperPartCode(String operPartCode) {
        this.operPartCode = operPartCode == null ? null : operPartCode.trim();
    }

    public String getOperPartName() {
        return operPartName;
    }

    public void setOperPartName(String operPartName) {
        this.operPartName = operPartName == null ? null : operPartName.trim();
    }

    public String getExamCategCode() {
        return examCategCode;
    }

    public void setExamCategCode(String examCategCode) {
        this.examCategCode = examCategCode == null ? null : examCategCode.trim();
    }

    public String getExamCategName() {
        return examCategName;
    }

    public void setExamCategName(String examCategName) {
        this.examCategName = examCategName == null ? null : examCategName.trim();
    }

    public String getExamItemCode() {
        return examItemCode;
    }

    public void setExamItemCode(String examItemCode) {
        this.examItemCode = examItemCode == null ? null : examItemCode.trim();
    }

    public String getExamItemName() {
        return examItemName;
    }

    public void setExamItemName(String examItemName) {
        this.examItemName = examItemName == null ? null : examItemName.trim();
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode == null ? null : applyDeptCode.trim();
    }

    public String getApplyDeptName() {
        return applyDeptName;
    }

    public void setApplyDeptName(String applyDeptName) {
        this.applyDeptName = applyDeptName == null ? null : applyDeptName.trim();
    }

    public String getApplyDrCode() {
        return applyDrCode;
    }

    public void setApplyDrCode(String applyDrCode) {
        this.applyDrCode = applyDrCode == null ? null : applyDrCode.trim();
    }

    public String getApplyDrName() {
        return applyDrName;
    }

    public void setApplyDrName(String applyDrName) {
        this.applyDrName = applyDrName == null ? null : applyDrName.trim();
    }

    public String getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(String executeDate) {
        this.executeDate = executeDate == null ? null : executeDate.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getExamResult() {
        return examResult;
    }

    public void setExamResult(String examResult) {
        this.examResult = examResult == null ? null : examResult.trim();
    }

    public String getExamDescription() {
        return examDescription;
    }

    public void setExamDescription(String examDescription) {
        this.examDescription = examDescription == null ? null : examDescription.trim();
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "ExamReport{" +
                "reportNo='" + reportNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", requisitionNo='" + requisitionNo + '\'' +
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
                ", examResult='" + examResult + '\'' +
                ", examDescription='" + examDescription + '\'' +
                ", reportDate='" + reportDate + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}