package com.lanniuh.hospmedical.model.signedpatientinfo;

import java.io.Serializable;

public class SignedPatientInfo implements Serializable {
    private static final long serialVersionUID = -1036807129464545480L;
    private String organCode;//组织机构代码
    private String patIndexNo;//病人主索引号
    private String visitCardNo;//就诊卡号
    private String patName;//姓名
    private String idNumber;//身份证
    private String sexCode;//性别代码
    private String sexName;//性别名称
    private String age;//年龄
    private String mobileNo;//联系电话
    private String signedDate;//签约时间
    private String signedDrCode;//签约医生工号
    private String signedDrName;//签约医生姓名
    private String signedYear;//签约年份
    private String signedValidStartDate;//签约有效开始时间
    private String signedValidEndDate;//签约有效结束时间
    private String diagName;//诊断名称

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo == null ? null : patIndexNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(String signedDate) {
        this.signedDate = signedDate == null ? null : signedDate.trim();
    }

    public String getSignedDrCode() {
        return signedDrCode;
    }

    public void setSignedDrCode(String signedDrCode) {
        this.signedDrCode = signedDrCode == null ? null : signedDrCode.trim();
    }

    public String getSignedDrName() {
        return signedDrName;
    }

    public void setSignedDrName(String signedDrName) {
        this.signedDrName = signedDrName == null ? null : signedDrName.trim();
    }

    public String getSignedYear() {
        return signedYear;
    }

    public void setSignedYear(String signedYear) {
        this.signedYear = signedYear == null ? null : signedYear.trim();
    }

    public String getSignedValidStartDate() {
        return signedValidStartDate;
    }

    public void setSignedValidStartDate(String signedValidStartDate) {
        this.signedValidStartDate = signedValidStartDate == null ? null : signedValidStartDate.trim();
    }

    public String getSignedValidEndDate() {
        return signedValidEndDate;
    }

    public void setSignedValidEndDate(String signedValidEndDate) {
        this.signedValidEndDate = signedValidEndDate == null ? null : signedValidEndDate.trim();
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName == null ? null : diagName.trim();
    }

    @Override
    public String toString() {
        return "SignedPatientInfo{" +
                "patIndexNo='" + patIndexNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", sexName='" + sexName + '\'' +
                ", age='" + age + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", signedDate='" + signedDate + '\'' +
                ", signedDrCode='" + signedDrCode + '\'' +
                ", signedDrName='" + signedDrName + '\'' +
                ", signedYear='" + signedYear + '\'' +
                ", signedValidStartDate='" + signedValidStartDate + '\'' +
                ", signedValidEndDate='" + signedValidEndDate + '\'' +
                ", diagName='" + diagName + '\'' +
                '}';
    }
}