package com.lanniuh.hospmedical.model.examrequisition;

import java.io.Serializable;

public class ExamRequisition implements Serializable {
    private static final long serialVersionUID = 2107616533448852787L;
    private String organCode;//组织机构代码
    private String requisitionNo;//申请单编号
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospNum;//住院次数
    private String inhospSerialNo;//住院流水号
    private String applyDate;//申请日期
    private String examApplyItemCode;//检查申请项目代码
    private String examApplyItemName;//检查申请项目名称
    private String examTypeCode;//检查类别代码
    private String examTypeName;//检查类别名称
    private String finishDate;//完成日期
    private String operPartCode;//操作部位代码
    private String operPartName;//操作部位名称
    private String requisitionStatus;//申请单状态
    private String note;//备注

    public String getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(String requisitionNo) {
        this.requisitionNo = requisitionNo == null ? null : requisitionNo.trim();
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

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getExamApplyItemCode() {
        return examApplyItemCode;
    }

    public void setExamApplyItemCode(String examApplyItemCode) {
        this.examApplyItemCode = examApplyItemCode == null ? null : examApplyItemCode.trim();
    }

    public String getExamApplyItemName() {
        return examApplyItemName;
    }

    public void setExamApplyItemName(String examApplyItemName) {
        this.examApplyItemName = examApplyItemName == null ? null : examApplyItemName.trim();
    }

    public String getExamTypeCode() {
        return examTypeCode;
    }

    public void setExamTypeCode(String examTypeCode) {
        this.examTypeCode = examTypeCode == null ? null : examTypeCode.trim();
    }

    public String getExamTypeName() {
        return examTypeName;
    }

    public void setExamTypeName(String examTypeName) {
        this.examTypeName = examTypeName == null ? null : examTypeName.trim();
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate == null ? null : finishDate.trim();
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

    public String getRequisitionStatus() {
        return requisitionStatus;
    }

    public void setRequisitionStatus(String requisitionStatus) {
        this.requisitionStatus = requisitionStatus == null ? null : requisitionStatus.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "ExamRequisition{" +
                "requisitionNo='" + requisitionNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", applyDate='" + applyDate + '\'' +
                ", examApplyItemCode='" + examApplyItemCode + '\'' +
                ", examApplyItemName='" + examApplyItemName + '\'' +
                ", examTypeCode='" + examTypeCode + '\'' +
                ", examTypeName='" + examTypeName + '\'' +
                ", finishDate='" + finishDate + '\'' +
                ", operPartCode='" + operPartCode + '\'' +
                ", operPartName='" + operPartName + '\'' +
                ", requisitionStatus='" + requisitionStatus + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}