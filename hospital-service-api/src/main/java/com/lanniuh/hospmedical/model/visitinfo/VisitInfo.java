package com.lanniuh.hospmedical.model.visitinfo;

import java.io.Serializable;

public class VisitInfo implements Serializable {
    private static final long serialVersionUID = 731047639639023666L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String visitCardNo;//就诊卡号
    private String patName;//患者姓名
    private String idNumber;//身份证号码
    private String sexCode;//性别代码
    private String sexName;//性别名称
    private String birthDate;//出生日期
    private String mobileNo;//手机号码
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String patTypeCode;//患者类型代码
    private String patTypeName;//患者类型名称
    private String registNo;//挂号流水号
    private String registDate;//挂号日期时间
    private String visitDate;//就诊日期时间
    private String visitStartDate;//就诊开始时间
    private String visitEndDate;//就诊结束时间
    private String chiefDescr;//主诉
    private String currDiseaseHistory;//现病史
    private String pastDiseaseHistory;//既往史
    private String allergyHistory;//过敏史
    private String receptTreatDrCode;//接诊医生工号
    private String receptTreatDrName;//接诊医生姓名
    private String visitDeptCode;//就诊科室代码
    private String visitDeptName;//就诊科室名称
    private String diagCode;//诊断代码
    private String diagName;//诊断名称
    private String physicalExam;//体格检查
    private String treatmentAdvice;//处理意见
    private String diseasesReportedFlag;//疾病报卡标志

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo == null ? null : outhospSerialNo.trim();
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

    public String getVisitCardNo() {
        return visitCardNo;
    }

    public void setVisitCardNo(String visitCardNo) {
        this.visitCardNo = visitCardNo == null ? null : visitCardNo.trim();
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName == null ? null : patName.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName == null ? null : sexName.trim();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getOuthospNo() {
        return outhospNo;
    }

    public void setOuthospNo(String outhospNo) {
        this.outhospNo = outhospNo == null ? null : outhospNo.trim();
    }

    public String getPatTypeCode() {
        return patTypeCode;
    }

    public void setPatTypeCode(String patTypeCode) {
        this.patTypeCode = patTypeCode == null ? null : patTypeCode.trim();
    }

    public String getPatTypeName() {
        return patTypeName;
    }

    public void setPatTypeName(String patTypeName) {
        this.patTypeName = patTypeName == null ? null : patTypeName.trim();
    }

    public String getRegistNo() {
        return registNo;
    }

    public void setRegistNo(String registNo) {
        this.registNo = registNo == null ? null : registNo.trim();
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate == null ? null : registDate.trim();
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate == null ? null : visitDate.trim();
    }

    public String getVisitStartDate() {
        return visitStartDate;
    }

    public void setVisitStartDate(String visitStartDate) {
        this.visitStartDate = visitStartDate == null ? null : visitStartDate.trim();
    }

    public String getVisitEndDate() {
        return visitEndDate;
    }

    public void setVisitEndDate(String visitEndDate) {
        this.visitEndDate = visitEndDate == null ? null : visitEndDate.trim();
    }

    public String getChiefDescr() {
        return chiefDescr;
    }

    public void setChiefDescr(String chiefDescr) {
        this.chiefDescr = chiefDescr == null ? null : chiefDescr.trim();
    }

    public String getCurrDiseaseHistory() {
        return currDiseaseHistory;
    }

    public void setCurrDiseaseHistory(String currDiseaseHistory) {
        this.currDiseaseHistory = currDiseaseHistory == null ? null : currDiseaseHistory.trim();
    }

    public String getPastDiseaseHistory() {
        return pastDiseaseHistory;
    }

    public void setPastDiseaseHistory(String pastDiseaseHistory) {
        this.pastDiseaseHistory = pastDiseaseHistory == null ? null : pastDiseaseHistory.trim();
    }

    public String getAllergyHistory() {
        return allergyHistory;
    }

    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
    }

    public String getReceptTreatDrCode() {
        return receptTreatDrCode;
    }

    public void setReceptTreatDrCode(String receptTreatDrCode) {
        this.receptTreatDrCode = receptTreatDrCode == null ? null : receptTreatDrCode.trim();
    }

    public String getReceptTreatDrName() {
        return receptTreatDrName;
    }

    public void setReceptTreatDrName(String receptTreatDrName) {
        this.receptTreatDrName = receptTreatDrName == null ? null : receptTreatDrName.trim();
    }

    public String getVisitDeptCode() {
        return visitDeptCode;
    }

    public void setVisitDeptCode(String visitDeptCode) {
        this.visitDeptCode = visitDeptCode == null ? null : visitDeptCode.trim();
    }

    public String getVisitDeptName() {
        return visitDeptName;
    }

    public void setVisitDeptName(String visitDeptName) {
        this.visitDeptName = visitDeptName == null ? null : visitDeptName.trim();
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode == null ? null : diagCode.trim();
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName == null ? null : diagName.trim();
    }

    public String getPhysicalExam() {
        return physicalExam;
    }

    public void setPhysicalExam(String physicalExam) {
        this.physicalExam = physicalExam == null ? null : physicalExam.trim();
    }

    public String getTreatmentAdvice() {
        return treatmentAdvice;
    }

    public void setTreatmentAdvice(String treatmentAdvice) {
        this.treatmentAdvice = treatmentAdvice == null ? null : treatmentAdvice.trim();
    }

    public String getDiseasesReportedFlag() {
        return diseasesReportedFlag;
    }

    public void setDiseasesReportedFlag(String diseasesReportedFlag) {
        this.diseasesReportedFlag = diseasesReportedFlag == null ? null : diseasesReportedFlag.trim();
    }

    @Override
    public String toString() {
        return "VisitInfo{" +
                "outhospSerialNo='" + outhospSerialNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", sexName='" + sexName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", patTypeCode='" + patTypeCode + '\'' +
                ", patTypeName='" + patTypeName + '\'' +
                ", registNo='" + registNo + '\'' +
                ", registDate='" + registDate + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", visitStartDate='" + visitStartDate + '\'' +
                ", visitEndDate='" + visitEndDate + '\'' +
                ", chiefDescr='" + chiefDescr + '\'' +
                ", currDiseaseHistory='" + currDiseaseHistory + '\'' +
                ", pastDiseaseHistory='" + pastDiseaseHistory + '\'' +
                ", allergyHistory='" + allergyHistory + '\'' +
                ", receptTreatDrCode='" + receptTreatDrCode + '\'' +
                ", receptTreatDrName='" + receptTreatDrName + '\'' +
                ", visitDeptCode='" + visitDeptCode + '\'' +
                ", visitDeptName='" + visitDeptName + '\'' +
                ", diagCode='" + diagCode + '\'' +
                ", diagName='" + diagName + '\'' +
                ", physicalExam='" + physicalExam + '\'' +
                ", treatmentAdvice='" + treatmentAdvice + '\'' +
                ", diseasesReportedFlag='" + diseasesReportedFlag + '\'' +
                '}';
    }
}