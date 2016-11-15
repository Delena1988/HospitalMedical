package cn.joinhealth.hospmedical.model.patientinfo;

import java.io.Serializable;

public class PatientInfo implements Serializable{
    private static final long serialVersionUID = 1582209560728850185L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String inhospNo;//住院号
    private String patName;//患者姓名
    private String idNumber;//身份证号码
    private String birthDate;//出生日期
    private String sexCode;//性别代码
    private String sexName;//性别名称
    private String ethnicCode;//民族代码
    private String ethnicName;//名族名称
    private String mobileNo;//手机号码
    private String contactName;//联系人姓名
    private String contactRelation;//联系人关系
    private String contactPhoneNo;//联系人电话

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

    public String getOuthospNo() {
        return outhospNo;
    }

    public void setOuthospNo(String outhospNo) {
        this.outhospNo = outhospNo == null ? null : outhospNo.trim();
    }

    public String getInhospNo() {
        return inhospNo;
    }

    public void setInhospNo(String inhospNo) {
        this.inhospNo = inhospNo == null ? null : inhospNo.trim();
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
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

    public String getEthnicCode() {
        return ethnicCode;
    }

    public void setEthnicCode(String ethnicCode) {
        this.ethnicCode = ethnicCode == null ? null : ethnicCode.trim();
    }

    public String getEthnicName() {
        return ethnicName;
    }

    public void setEthnicName(String ethnicName) {
        this.ethnicName = ethnicName == null ? null : ethnicName.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactRelation() {
        return contactRelation;
    }

    public void setContactRelation(String contactRelation) {
        this.contactRelation = contactRelation == null ? null : contactRelation.trim();
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo == null ? null : contactPhoneNo.trim();
    }

    @Override
    public String toString() {
        return "PatientInfo{" +
                "patIndexNo='" + patIndexNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", sexName='" + sexName + '\'' +
                ", ethnicCode='" + ethnicCode + '\'' +
                ", ethnicName='" + ethnicName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactRelation='" + contactRelation + '\'' +
                ", contactPhoneNo='" + contactPhoneNo + '\'' +
                '}';
    }
}