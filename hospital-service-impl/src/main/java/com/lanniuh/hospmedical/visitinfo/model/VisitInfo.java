package com.lanniuh.hospmedical.visitinfo.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class VisitInfo implements Serializable {
    private static final long serialVersionUID = 2503176014365734490L;

    private String organCode;

    private String patIndexNo;

    private String visitCardNo;

    private String outhospNo;

    private String outhospSerialNo;

    private String patTypeCode;

    private String patTypeName;

    private String registNo;

    private Date registDate;

    private Date visitDate;

    private Date visitStartDate;

    private Date visitEndDate;

    private String chiefDescr;

    private String currDiseaseHistory;

    private String pastDiseaseHistory;

    private String receptTreatDrCode;

    private String receptTreatDrName;

    private String visitDeptCode;

    private String visitDeptName;

    private String diagCode;

    private String diagName;

    private String allergyHistory;

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

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public Date getVisitStartDate() {
        return visitStartDate;
    }

    public void setVisitStartDate(Date visitStartDate) {
        this.visitStartDate = visitStartDate;
    }

    public Date getVisitEndDate() {
        return visitEndDate;
    }

    public void setVisitEndDate(Date visitEndDate) {
        this.visitEndDate = visitEndDate;
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

    public String getAllergyHistory() {
        return allergyHistory;
    }

    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
    }

    @Override
    public String toString() {
        return "VisitInfo{" +
                "organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", patTypeCode='" + patTypeCode + '\'' +
                ", patTypeName='" + patTypeName + '\'' +
                ", registNo='" + registNo + '\'' +
                ", registDate=" + registDate +
                ", visitDate=" + visitDate +
                ", visitStartDate=" + visitStartDate +
                ", visitEndDate=" + visitEndDate +
                ", chiefDescr='" + chiefDescr + '\'' +
                ", currDiseaseHistory='" + currDiseaseHistory + '\'' +
                ", pastDiseaseHistory='" + pastDiseaseHistory + '\'' +
                ", receptTreatDrCode='" + receptTreatDrCode + '\'' +
                ", receptTreatDrName='" + receptTreatDrName + '\'' +
                ", visitDeptCode='" + visitDeptCode + '\'' +
                ", visitDeptName='" + visitDeptName + '\'' +
                ", diagCode='" + diagCode + '\'' +
                ", diagName='" + diagName + '\'' +
                ", allergyHistory='" + allergyHistory + '\'' +
                '}';
    }
}