package com.lanniuh.hospmedical.model.inhosprecord;

import java.io.Serializable;

public class InhospRecord implements Serializable {
    private static final long serialVersionUID = -6531188812438812227L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String visitCardNo;//就诊卡号
    private String patName;//患者姓名
    private String idNumber;//身份证号码
    private String sexCode;//性别代码
    private String sexName;//性别名称
    private String birthDate;//出生日期
    private String mobileNo;//手机号码
    private String inhospNo;//住院号
    private String inhospNum;//住院次数
    private String inhospSerialNo;//住院流水号
    private String deptCode;//科室代码
    private String deptName;//科室名称
    private String wardCode;//病区代码
    private String wardName;//病区名称
    private String sickroomNo;//病房号
    private String bedNo;//病床号
    private String admitDate;//入院日期
    private String admitSituation;//入院情况
    private String admitWayCode;//入院途径代码
    private String admitWayName;//入院途径名称
    private String patChiefDescr;//患者主诉
    private String briefDiseaseSituation;//简要病情
    private String currDiseaseHistory;//现病史
    private String diseaseHistory;//疾病史
    private String surgeryHistory;//手术史
    private String metachysisHistory;//输血史
    private String allergyHistory;//过敏史
    private String infectDiseaseHistory;//传染病史
    private String admitDiagCode;//入院诊断代码
    private String admitDiagName;//入院诊断名称
    private String receptTreatDrCode;//接诊医师工号
    private String receptTreatDrName;//接诊医师姓名
    private String inhospDrCode;//住院医师工号
    private String inhospDrName;//住院医师姓名
    private String attendDrCode;//主治医师工号
    private String attendDrName;//主治医师姓名
    private String chiefDrCode;//主任医师工号
    private String chiefDrName;//主任医师姓名
    private String treatProcessDescr;//诊疗过程描述
    private String dischargeStatus;//出院情况  出院小结url
    private String dischargeDate;//出院日期时间
    private String dischargeDiagCode;//出院诊断代码
    private String dischargeDiagName;//出院诊断名称
    private String outcomeCode;//转归情况代码
    private String outcomeName;//转归情况名称
    private String dischargeMethodCode;//离院方式代码
    private String dischargeMethodName;//离院方式名称
    private String physicalExam;//体格检查
    private String treatmentAdvice;//处理意见
    private String diseasesReportedFlag;//疾病报卡标志
    private String inhospStatus;//在院状态 1出院  2在院


    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo == null ? null : inhospSerialNo.trim();
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
        this.birthDate = birthDate;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode == null ? null : wardCode.trim();
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    public String getSickroomNo() {
        return sickroomNo;
    }

    public void setSickroomNo(String sickroomNo) {
        this.sickroomNo = sickroomNo == null ? null : sickroomNo.trim();
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate == null ? null : admitDate.trim();
    }

    public String getAdmitSituation() {
        return admitSituation;
    }

    public void setAdmitSituation(String admitSituation) {
        this.admitSituation = admitSituation == null ? null : admitSituation.trim();
    }

    public String getAdmitWayCode() {
        return admitWayCode;
    }

    public void setAdmitWayCode(String admitWayCode) {
        this.admitWayCode = admitWayCode == null ? null : admitWayCode.trim();
    }

    public String getAdmitWayName() {
        return admitWayName;
    }

    public void setAdmitWayName(String admitWayName) {
        this.admitWayName = admitWayName == null ? null : admitWayName.trim();
    }

    public String getPatChiefDescr() {
        return patChiefDescr;
    }

    public void setPatChiefDescr(String patChiefDescr) {
        this.patChiefDescr = patChiefDescr == null ? null : patChiefDescr.trim();
    }

    public String getBriefDiseaseSituation() {
        return briefDiseaseSituation;
    }

    public void setBriefDiseaseSituation(String briefDiseaseSituation) {
        this.briefDiseaseSituation = briefDiseaseSituation == null ? null : briefDiseaseSituation.trim();
    }

    public String getCurrDiseaseHistory() {
        return currDiseaseHistory;
    }

    public void setCurrDiseaseHistory(String currDiseaseHistory) {
        this.currDiseaseHistory = currDiseaseHistory == null ? null : currDiseaseHistory.trim();
    }

    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory == null ? null : diseaseHistory.trim();
    }

    public String getSurgeryHistory() {
        return surgeryHistory;
    }

    public void setSurgeryHistory(String surgeryHistory) {
        this.surgeryHistory = surgeryHistory == null ? null : surgeryHistory.trim();
    }

    public String getMetachysisHistory() {
        return metachysisHistory;
    }

    public void setMetachysisHistory(String metachysisHistory) {
        this.metachysisHistory = metachysisHistory == null ? null : metachysisHistory.trim();
    }

    public String getAllergyHistory() {
        return allergyHistory;
    }

    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
    }

    public String getInfectDiseaseHistory() {
        return infectDiseaseHistory;
    }

    public void setInfectDiseaseHistory(String infectDiseaseHistory) {
        this.infectDiseaseHistory = infectDiseaseHistory == null ? null : infectDiseaseHistory.trim();
    }

    public String getAdmitDiagCode() {
        return admitDiagCode;
    }

    public void setAdmitDiagCode(String admitDiagCode) {
        this.admitDiagCode = admitDiagCode == null ? null : admitDiagCode.trim();
    }

    public String getAdmitDiagName() {
        return admitDiagName;
    }

    public void setAdmitDiagName(String admitDiagName) {
        this.admitDiagName = admitDiagName == null ? null : admitDiagName.trim();
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

    public String getInhospDrCode() {
        return inhospDrCode;
    }

    public void setInhospDrCode(String inhospDrCode) {
        this.inhospDrCode = inhospDrCode == null ? null : inhospDrCode.trim();
    }

    public String getInhospDrName() {
        return inhospDrName;
    }

    public void setInhospDrName(String inhospDrName) {
        this.inhospDrName = inhospDrName == null ? null : inhospDrName.trim();
    }

    public String getAttendDrCode() {
        return attendDrCode;
    }

    public void setAttendDrCode(String attendDrCode) {
        this.attendDrCode = attendDrCode == null ? null : attendDrCode.trim();
    }

    public String getAttendDrName() {
        return attendDrName;
    }

    public void setAttendDrName(String attendDrName) {
        this.attendDrName = attendDrName == null ? null : attendDrName.trim();
    }

    public String getChiefDrCode() {
        return chiefDrCode;
    }

    public void setChiefDrCode(String chiefDrCode) {
        this.chiefDrCode = chiefDrCode == null ? null : chiefDrCode.trim();
    }

    public String getChiefDrName() {
        return chiefDrName;
    }

    public void setChiefDrName(String chiefDrName) {
        this.chiefDrName = chiefDrName == null ? null : chiefDrName.trim();
    }

    public String getTreatProcessDescr() {
        return treatProcessDescr;
    }

    public void setTreatProcessDescr(String treatProcessDescr) {
        this.treatProcessDescr = treatProcessDescr == null ? null : treatProcessDescr.trim();
    }

    public String getDischargeStatus() {
        return dischargeStatus;
    }

    public void setDischargeStatus(String dischargeStatus) {
        this.dischargeStatus = dischargeStatus == null ? null : dischargeStatus.trim();
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    public String getDischargeDiagCode() {
        return dischargeDiagCode;
    }

    public void setDischargeDiagCode(String dischargeDiagCode) {
        this.dischargeDiagCode = dischargeDiagCode == null ? null : dischargeDiagCode.trim();
    }

    public String getDischargeDiagName() {
        return dischargeDiagName;
    }

    public void setDischargeDiagName(String dischargeDiagName) {
        this.dischargeDiagName = dischargeDiagName == null ? null : dischargeDiagName.trim();
    }

    public String getOutcomeCode() {
        return outcomeCode;
    }

    public void setOutcomeCode(String outcomeCode) {
        this.outcomeCode = outcomeCode == null ? null : outcomeCode.trim();
    }

    public String getOutcomeName() {
        return outcomeName;
    }

    public void setOutcomeName(String outcomeName) {
        this.outcomeName = outcomeName == null ? null : outcomeName.trim();
    }

    public String getDischargeMethodCode() {
        return dischargeMethodCode;
    }

    public void setDischargeMethodCode(String dischargeMethodCode) {
        this.dischargeMethodCode = dischargeMethodCode == null ? null : dischargeMethodCode.trim();
    }

    public String getDischargeMethodName() {
        return dischargeMethodName;
    }

    public void setDischargeMethodName(String dischargeMethodName) {
        this.dischargeMethodName = dischargeMethodName == null ? null : dischargeMethodName.trim();
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

    public String getInhospStatus() {
        return inhospStatus;
    }

    public void setInhospStatus(String inhospStatus) {
        this.inhospStatus = inhospStatus == null ? null : inhospStatus.trim();
    }

    @Override
    public String toString() {
        return "InhospRecord{" +
                "inhospSerialNo='" + inhospSerialNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", sexName='" + sexName + '\'' +
                ", birthDate=" + birthDate +
                ", mobileNo='" + mobileNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", wardCode='" + wardCode + '\'' +
                ", wardName='" + wardName + '\'' +
                ", sickroomNo='" + sickroomNo + '\'' +
                ", bedNo='" + bedNo + '\'' +
                ", admitDate='" + admitDate + '\'' +
                ", admitSituation='" + admitSituation + '\'' +
                ", admitWayCode='" + admitWayCode + '\'' +
                ", admitWayName='" + admitWayName + '\'' +
                ", patChiefDescr='" + patChiefDescr + '\'' +
                ", briefDiseaseSituation='" + briefDiseaseSituation + '\'' +
                ", currDiseaseHistory='" + currDiseaseHistory + '\'' +
                ", diseaseHistory='" + diseaseHistory + '\'' +
                ", surgeryHistory='" + surgeryHistory + '\'' +
                ", metachysisHistory='" + metachysisHistory + '\'' +
                ", allergyHistory='" + allergyHistory + '\'' +
                ", infectDiseaseHistory='" + infectDiseaseHistory + '\'' +
                ", admitDiagCode='" + admitDiagCode + '\'' +
                ", admitDiagName='" + admitDiagName + '\'' +
                ", receptTreatDrCode='" + receptTreatDrCode + '\'' +
                ", receptTreatDrName='" + receptTreatDrName + '\'' +
                ", inhospDrCode='" + inhospDrCode + '\'' +
                ", inhospDrName='" + inhospDrName + '\'' +
                ", attendDrCode='" + attendDrCode + '\'' +
                ", attendDrName='" + attendDrName + '\'' +
                ", chiefDrCode='" + chiefDrCode + '\'' +
                ", chiefDrName='" + chiefDrName + '\'' +
                ", treatProcessDescr='" + treatProcessDescr + '\'' +
                ", dischargeStatus='" + dischargeStatus + '\'' +
                ", dischargeDate='" + dischargeDate + '\'' +
                ", dischargeDiagCode='" + dischargeDiagCode + '\'' +
                ", dischargeDiagName='" + dischargeDiagName + '\'' +
                ", outcomeCode='" + outcomeCode + '\'' +
                ", outcomeName='" + outcomeName + '\'' +
                ", dischargeMethodCode='" + dischargeMethodCode + '\'' +
                ", dischargeMethodName='" + dischargeMethodName + '\'' +
                ", physicalExam='" + physicalExam + '\'' +
                ", treatmentAdvice='" + treatmentAdvice + '\'' +
                ", diseasesReportedFlag='" + diseasesReportedFlag + '\'' +
                ", inhospStatus='" + inhospStatus + '\'' +
                '}';
    }
}