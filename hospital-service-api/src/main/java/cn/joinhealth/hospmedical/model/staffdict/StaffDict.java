package cn.joinhealth.hospmedical.model.staffdict;

import java.io.Serializable;

public class StaffDict implements Serializable {
    private static final long serialVersionUID = -9098398634332433637L;
    private String organCode;//组织机构代码
    private String staffIndexNo;//职工索引号
    private String staffCode;//职工工号
    private String staffName;//职工姓名
    private String pinyinCode;//拼音码
    private String idNumber;//身份证号码
    private String sexCode;//性别代码
    private String sexName;//性别名称
    private String titleCode;//职称代码
    private String titleName;//职称名称
    private String mobileNo;//手机号码
    private String email;//邮箱
    private String birthDate;//出生日期
    private String staffBriefing;//职工简介
    private String goodDescr;//擅长说明
    private String suborDeptCode;//从属科室代码
    private String suborDeptName;//从属科室名称
    private String invalidFlag;//作废标志  0、作废1、正常

    public String getStaffIndexNo() {
        return staffIndexNo;
    }

    public void setStaffIndexNo(String staffIndexNo) {
        this.staffIndexNo = staffIndexNo == null ? null : staffIndexNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode == null ? null : staffCode.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode == null ? null : pinyinCode.trim();
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

    public String getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode == null ? null : titleCode.trim();
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    public String getStaffBriefing() {
        return staffBriefing;
    }

    public void setStaffBriefing(String staffBriefing) {
        this.staffBriefing = staffBriefing == null ? null : staffBriefing.trim();
    }

    public String getGoodDescr() {
        return goodDescr;
    }

    public void setGoodDescr(String goodDescr) {
        this.goodDescr = goodDescr == null ? null : goodDescr.trim();
    }

    public String getSuborDeptCode() {
        return suborDeptCode;
    }

    public void setSuborDeptCode(String suborDeptCode) {
        this.suborDeptCode = suborDeptCode == null ? null : suborDeptCode.trim();
    }

    public String getSuborDeptName() {
        return suborDeptName;
    }

    public void setSuborDeptName(String suborDeptName) {
        this.suborDeptName = suborDeptName == null ? null : suborDeptName.trim();
    }

    public String getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(String invalidFlag) {
        this.invalidFlag = invalidFlag == null ? null : invalidFlag.trim();
    }

    @Override
    public String toString() {
        return "StaffDict{" +
                "staffIndexNo='" + staffIndexNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", staffCode='" + staffCode + '\'' +
                ", staffName='" + staffName + '\'' +
                ", pinyinCode='" + pinyinCode + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", sexName='" + sexName + '\'' +
                ", titleCode='" + titleCode + '\'' +
                ", titleName='" + titleName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", staffBriefing='" + staffBriefing + '\'' +
                ", goodDescr='" + goodDescr + '\'' +
                ", suborDeptCode='" + suborDeptCode + '\'' +
                ", suborDeptName='" + suborDeptName + '\'' +
                ", invalidFlag='" + invalidFlag + '\'' +
                '}';
    }
}