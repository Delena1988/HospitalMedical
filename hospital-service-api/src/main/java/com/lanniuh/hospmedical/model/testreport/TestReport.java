package com.lanniuh.hospmedical.model.testreport;

import java.io.Serializable;

public class TestReport implements Serializable {
    private static final long serialVersionUID = 6862592312080617579L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospNum;//住院次数
    private String inhospSerialNo;//住院流水号
    private String requisitionNo;//申请单编号
    private String requisitionNoItem;//申请单分项目序号
    private String reportNo;//报告单编号
    private String barcodeNo;//条码号
    private String reportName;//报告名称
    private String sampleTypeCode;//样本类型代码
    private String sampleTypeName;//样本类型名称
    private String testItemCode;//检验项目代码
    private String testItemName;//检验项目名称
    private String microbeTestFlag;//微生物检验标志  0、非微生物1、微生物
    private String equipmentCode;//设备代码
    private String equipmentName;//设备名称
    private String applyDate;//申请日期
    private String applyDeptCode;//申请科室代码
    private String applyDeptName;//申请科室名称
    private String applyDrCode;//申请医生工号
    private String applyDrName;//申请医生姓名
    private String executeDate;//执行日期
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

    public String getRequisitionNoItem() {
        return requisitionNoItem;
    }

    public void setRequisitionNoItem(String requisitionNoItem) {
        this.requisitionNoItem = requisitionNoItem == null ? null : requisitionNoItem.trim();
    }

    public String getBarcodeNo() {
        return barcodeNo;
    }

    public void setBarcodeNo(String barcodeNo) {
        this.barcodeNo = barcodeNo == null ? null : barcodeNo.trim();
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName == null ? null : reportName.trim();
    }

    public String getSampleTypeCode() {
        return sampleTypeCode;
    }

    public void setSampleTypeCode(String sampleTypeCode) {
        this.sampleTypeCode = sampleTypeCode == null ? null : sampleTypeCode.trim();
    }

    public String getSampleTypeName() {
        return sampleTypeName;
    }

    public void setSampleTypeName(String sampleTypeName) {
        this.sampleTypeName = sampleTypeName == null ? null : sampleTypeName.trim();
    }

    public String getTestItemCode() {
        return testItemCode;
    }

    public void setTestItemCode(String testItemCode) {
        this.testItemCode = testItemCode == null ? null : testItemCode.trim();
    }

    public String getTestItemName() {
        return testItemName;
    }

    public void setTestItemName(String testItemName) {
        this.testItemName = testItemName == null ? null : testItemName.trim();
    }

    public String getMicrobeTestFlag() {
        return microbeTestFlag;
    }

    public void setMicrobeTestFlag(String microbeTestFlag) {
        this.microbeTestFlag = microbeTestFlag == null ? null : microbeTestFlag.trim();
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
        return "TestReport{" +
                "reportNo='" + reportNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", requisitionNo='" + requisitionNo + '\'' +
                ", requisitionNoItem='" + requisitionNoItem + '\'' +
                ", barcodeNo='" + barcodeNo + '\'' +
                ", reportName='" + reportName + '\'' +
                ", sampleTypeCode='" + sampleTypeCode + '\'' +
                ", sampleTypeName='" + sampleTypeName + '\'' +
                ", testItemCode='" + testItemCode + '\'' +
                ", testItemName='" + testItemName + '\'' +
                ", microbeTestFlag='" + microbeTestFlag + '\'' +
                ", equipmentCode='" + equipmentCode + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", applyDate='" + applyDate + '\'' +
                ", applyDeptCode='" + applyDeptCode + '\'' +
                ", applyDeptName='" + applyDeptName + '\'' +
                ", applyDrCode='" + applyDrCode + '\'' +
                ", applyDrName='" + applyDrName + '\'' +
                ", executeDate='" + executeDate + '\'' +
                ", reportDate='" + reportDate + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}