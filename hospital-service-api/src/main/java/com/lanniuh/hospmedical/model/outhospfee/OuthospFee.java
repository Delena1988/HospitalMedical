package com.lanniuh.hospmedical.model.outhospfee;

import java.io.Serializable;

public class OuthospFee implements Serializable {
    private static final long serialVersionUID = 5105125506877345273L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String dealNo;//交易流水号
    private String presNo;//处方号
    private String mfsMethodCode;//医疗费用结算方式代码
    private String mfsMethodName;//医疗费用结算方式名称
    private String medicareCategory;//医疗保险类别
    private String medicalTotalFee;//医疗总费用
    private String medicareFee;//医保支付费用
    private String reduceFee;//减免费用
    private String selfExpenseFee;//自理费用
    private String selfPaymentFee;//自费费用
    private String selfNegativeFee;//自负费用
    private String settlementDate;//结算日期
    private String chargeDate;//收费日期
    private String refundFlag;//退费标志  0、默认（正常结算） 1、退费

    public String getDealNo() {
        return dealNo;
    }

    public void setDealNo(String dealNo) {
        this.dealNo = dealNo == null ? null : dealNo.trim();
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

    public String getPresNo() {
        return presNo;
    }

    public void setPresNo(String presNo) {
        this.presNo = presNo == null ? null : presNo.trim();
    }

    public String getMfsMethodCode() {
        return mfsMethodCode;
    }

    public void setMfsMethodCode(String mfsMethodCode) {
        this.mfsMethodCode = mfsMethodCode == null ? null : mfsMethodCode.trim();
    }

    public String getMfsMethodName() {
        return mfsMethodName;
    }

    public void setMfsMethodName(String mfsMethodName) {
        this.mfsMethodName = mfsMethodName == null ? null : mfsMethodName.trim();
    }

    public String getMedicareCategory() {
        return medicareCategory;
    }

    public void setMedicareCategory(String medicareCategory) {
        this.medicareCategory = medicareCategory == null ? null : medicareCategory.trim();
    }

    public String getMedicalTotalFee() {
        return medicalTotalFee;
    }

    public void setMedicalTotalFee(String medicalTotalFee) {
        this.medicalTotalFee = medicalTotalFee == null ? null : medicalTotalFee.trim();
    }

    public String getMedicareFee() {
        return medicareFee;
    }

    public void setMedicareFee(String medicareFee) {
        this.medicareFee = medicareFee == null ? null : medicareFee.trim();
    }

    public String getReduceFee() {
        return reduceFee;
    }

    public void setReduceFee(String reduceFee) {
        this.reduceFee = reduceFee == null ? null : reduceFee.trim();
    }

    public String getSelfExpenseFee() {
        return selfExpenseFee;
    }

    public void setSelfExpenseFee(String selfExpenseFee) {
        this.selfExpenseFee = selfExpenseFee == null ? null : selfExpenseFee.trim();
    }

    public String getSelfPaymentFee() {
        return selfPaymentFee;
    }

    public void setSelfPaymentFee(String selfPaymentFee) {
        this.selfPaymentFee = selfPaymentFee == null ? null : selfPaymentFee.trim();
    }

    public String getSelfNegativeFee() {
        return selfNegativeFee;
    }

    public void setSelfNegativeFee(String selfNegativeFee) {
        this.selfNegativeFee = selfNegativeFee == null ? null : selfNegativeFee.trim();
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate == null ? null : settlementDate.trim();
    }

    public String getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(String chargeDate) {
        this.chargeDate = chargeDate == null ? null : chargeDate.trim();
    }

    public String getRefundFlag() {
        return refundFlag;
    }

    public void setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag == null ? null : refundFlag.trim();
    }

    @Override
    public String toString() {
        return "OuthospFee{" +
                "dealNo='" + dealNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", presNo='" + presNo + '\'' +
                ", mfsMethodCode='" + mfsMethodCode + '\'' +
                ", mfsMethodName='" + mfsMethodName + '\'' +
                ", medicareCategory='" + medicareCategory + '\'' +
                ", medicalTotalFee='" + medicalTotalFee + '\'' +
                ", medicareFee='" + medicareFee + '\'' +
                ", reduceFee='" + reduceFee + '\'' +
                ", selfExpenseFee='" + selfExpenseFee + '\'' +
                ", selfPaymentFee='" + selfPaymentFee + '\'' +
                ", selfNegativeFee='" + selfNegativeFee + '\'' +
                ", settlementDate='" + settlementDate + '\'' +
                ", chargeDate='" + chargeDate + '\'' +
                ", refundFlag='" + refundFlag + '\'' +
                '}';
    }
}