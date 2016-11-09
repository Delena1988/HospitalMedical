package com.lanniuh.hospmedical.model.cardnoinfo;

import java.io.Serializable;

public class CardNoInfo implements Serializable {
    private static final long serialVersionUID = -8171552595246115630L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String visitCardNo;//就诊卡号
    private String visitCardType;//就诊卡类别 1、就诊卡2、住院卡3、医保卡
    private String patName;//患者姓名
    private String idNumber;//身份证号
    private String invalidFlag;//作废标志
    private String openDate;//开卡日期

    public String getVisitCardNo() {
        return visitCardNo;
    }

    public void setVisitCardNo(String visitCardNo) {
        this.visitCardNo = visitCardNo == null ? null : visitCardNo.trim();
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

    public String getVisitCardType() {
        return visitCardType;
    }

    public void setVisitCardType(String visitCardType) {
        this.visitCardType = visitCardType == null ? null : visitCardType.trim();
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

    public String getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(String invalidFlag) {
        this.invalidFlag = invalidFlag == null ? null : invalidFlag.trim();
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate == null ? null : openDate.trim();
    }

    @Override
    public String toString() {
        return "CardNoInfoReq{" +
                "visitCardNo='" + visitCardNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardType='" + visitCardType + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", invalidFlag='" + invalidFlag + '\'' +
                ", openDate='" + openDate + '\'' +
                '}';
    }
}