package com.lanniuh.hospmedical.inhosprecord.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by linjian
 * 16/11/2.
 */
@Component
public class InhospRecord implements Serializable {
    private static final long serialVersionUID = -1729438372386048067L;
    private String organCode;

    private String patIndexNo;

    private String visitCardNo;

    private String patName;

    private String sexCode;

    private String sexName;

    private Date birthDate;

    private String inhospNo;

    private Integer inhospNum;

    private String inhospSerialNo;

    private String deptName;

    private String wardName;

    private String sickroomNo;

    private String bedNo;

    private Date admitDate;

    private String admitSituation;

    private String admitWayCode;

    private String admitWayName;

    private String patChiefDescr;

    private String briefDiseaseSituation;

    private String treatPlan;

    private String pastDiseaseHistoryDescr;

    private String diseaseHistory;

    private String surgeryHistory;

    private String metachysisHistory;

    private String infectDiseaseHistory;

    private String admitDiagCode;

    private String admitDiagName;

    private String receptTreatDrCode;

    private String receptTreatDrName;

    private String inhospDrCode;

    private String inhospDrName;

    private String attendDrCode;

    private String attendDrName;

    private String chiefDrCode;

    private String chiefDrName;

    private String nursingLevelCode;

    private String nursingLevelName;

    private String primaryNurseCode;

    private String primaryNurseName;

    private String treatProcessDescr;

    private String dischargeStatus;

    private Date dischargeDate;

    private String dischargeDiagCode;

    private String dischargeDiagName;

    private String dischargeSymptom;

    private String dischargeOrder;

    private String outcome;

    private String dischargeMethodCode;

    private String dischargeMethodName;

    private String mobileNo;

    private String idNumber;

    private String allergyHistory;

    private String deptCode;

    private String currDiseaseHistory;

    private String outcomeCode;

    private String outcomeName;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getInhospNo() {
        return inhospNo;
    }

    public void setInhospNo(String inhospNo) {
        this.inhospNo = inhospNo == null ? null : inhospNo.trim();
    }

    public Integer getInhospNum() {
        return inhospNum;
    }

    public void setInhospNum(Integer inhospNum) {
        this.inhospNum = inhospNum;
    }

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo == null ? null : inhospSerialNo.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
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

    public Date getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Date admitDate) {
        this.admitDate = admitDate;
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

    public String getTreatPlan() {
        return treatPlan;
    }

    public void setTreatPlan(String treatPlan) {
        this.treatPlan = treatPlan == null ? null : treatPlan.trim();
    }

    public String getPastDiseaseHistoryDescr() {
        return pastDiseaseHistoryDescr;
    }

    public void setPastDiseaseHistoryDescr(String pastDiseaseHistoryDescr) {
        this.pastDiseaseHistoryDescr = pastDiseaseHistoryDescr == null ? null : pastDiseaseHistoryDescr.trim();
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

    public String getNursingLevelCode() {
        return nursingLevelCode;
    }

    public void setNursingLevelCode(String nursingLevelCode) {
        this.nursingLevelCode = nursingLevelCode == null ? null : nursingLevelCode.trim();
    }

    public String getNursingLevelName() {
        return nursingLevelName;
    }

    public void setNursingLevelName(String nursingLevelName) {
        this.nursingLevelName = nursingLevelName == null ? null : nursingLevelName.trim();
    }

    public String getPrimaryNurseCode() {
        return primaryNurseCode;
    }

    public void setPrimaryNurseCode(String primaryNurseCode) {
        this.primaryNurseCode = primaryNurseCode == null ? null : primaryNurseCode.trim();
    }

    public String getPrimaryNurseName() {
        return primaryNurseName;
    }

    public void setPrimaryNurseName(String primaryNurseName) {
        this.primaryNurseName = primaryNurseName == null ? null : primaryNurseName.trim();
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

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
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

    public String getDischargeSymptom() {
        return dischargeSymptom;
    }

    public void setDischargeSymptom(String dischargeSymptom) {
        this.dischargeSymptom = dischargeSymptom == null ? null : dischargeSymptom.trim();
    }

    public String getDischargeOrder() {
        return dischargeOrder;
    }

    public void setDischargeOrder(String dischargeOrder) {
        this.dischargeOrder = dischargeOrder == null ? null : dischargeOrder.trim();
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome == null ? null : outcome.trim();
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getAllergyHistory() {
        return allergyHistory;
    }

    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getCurrDiseaseHistory() {
        return currDiseaseHistory;
    }

    public void setCurrDiseaseHistory(String currDiseaseHistory) {
        this.currDiseaseHistory = currDiseaseHistory == null ? null : currDiseaseHistory.trim();
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

    @Override
    public String toString() {
        return "InhospRecord{" +
                "organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", patName='" + patName + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", sexName='" + sexName + '\'' +
                ", birthDate=" + birthDate +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum=" + inhospNum +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", deptName='" + deptName + '\'' +
                ", wardName='" + wardName + '\'' +
                ", sickroomNo='" + sickroomNo + '\'' +
                ", bedNo='" + bedNo + '\'' +
                ", admitDate=" + admitDate +
                ", admitSituation='" + admitSituation + '\'' +
                ", admitWayCode='" + admitWayCode + '\'' +
                ", admitWayName='" + admitWayName + '\'' +
                ", patChiefDescr='" + patChiefDescr + '\'' +
                ", briefDiseaseSituation='" + briefDiseaseSituation + '\'' +
                ", treatPlan='" + treatPlan + '\'' +
                ", pastDiseaseHistoryDescr='" + pastDiseaseHistoryDescr + '\'' +
                ", diseaseHistory='" + diseaseHistory + '\'' +
                ", surgeryHistory='" + surgeryHistory + '\'' +
                ", metachysisHistory='" + metachysisHistory + '\'' +
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
                ", nursingLevelCode='" + nursingLevelCode + '\'' +
                ", nursingLevelName='" + nursingLevelName + '\'' +
                ", primaryNurseCode='" + primaryNurseCode + '\'' +
                ", primaryNurseName='" + primaryNurseName + '\'' +
                ", treatProcessDescr='" + treatProcessDescr + '\'' +
                ", dischargeStatus='" + dischargeStatus + '\'' +
                ", dischargeDate=" + dischargeDate +
                ", dischargeDiagCode='" + dischargeDiagCode + '\'' +
                ", dischargeDiagName='" + dischargeDiagName + '\'' +
                ", dischargeSymptom='" + dischargeSymptom + '\'' +
                ", dischargeOrder='" + dischargeOrder + '\'' +
                ", outcome='" + outcome + '\'' +
                ", dischargeMethodCode='" + dischargeMethodCode + '\'' +
                ", dischargeMethodName='" + dischargeMethodName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", allergyHistory='" + allergyHistory + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", currDiseaseHistory='" + currDiseaseHistory + '\'' +
                ", outcomeCode='" + outcomeCode + '\'' +
                ", outcomeName='" + outcomeName + '\'' +
                '}';
    }
}
