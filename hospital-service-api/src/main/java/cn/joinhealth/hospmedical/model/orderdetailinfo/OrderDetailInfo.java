package cn.joinhealth.hospmedical.model.orderdetailinfo;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 处方明细
 */
public class OrderDetailInfo implements Serializable {
    private static final long serialVersionUID = 903456562828105817L;
    private String organCode;//组织机构代码
    private String presNo;//处方号
    private String presGroupNo;//处方组号
    private String presSubNo;//处方子序号
    private String drugCode;//药品代码
    private String drugName;//药品名称
    private String drugSpecifications;//药品规格
    private String doseWayCode;//用药途径代码
    private String doseWayName;//用药途径名称
    private String drugUseOneDosage;//药品使用次剂量
    private String drugUseOneDosageUnit;//药品使用次剂量单位
    private String drugUseFrequencyCode;//药品使用频次代码
    private String drugUseFrequencyName;//药品使用频次名称
    private String drugFormCode;//药品剂型代码
    private String drugFormName;//药品剂型名称
    private String drugUnit;//药品单位
    private String drugUnitPrice;//药品单价
    private String drugAbbrev;//药品简称
    private String drugDescr;//药品描述
    private String presSustainedDays;//处方持续天数
    private String drugAmount;//药品数量
    private String baseAuxDrugFlag;//主副药标志  0、非主药 1、主药
    private String selfDrugFlag;//自备药标志  0、非自备药 1、自备药
    private String groupFlag;//成组标志  0、不成组1、成组
    private String note;//备注

    public String getPresSubNo() {
        return presSubNo;
    }

    public void setPresSubNo(String presSubNo) {
        this.presSubNo = presSubNo == null ? null : presSubNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getPresNo() {
        return presNo;
    }

    public void setPresNo(String presNo) {
        this.presNo = presNo == null ? null : presNo.trim();
    }

    public String getPresGroupNo() {
        return presGroupNo;
    }

    public void setPresGroupNo(String presGroupNo) {
        this.presGroupNo = presGroupNo == null ? null : presGroupNo.trim();
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getDrugSpecifications() {
        return drugSpecifications;
    }

    public void setDrugSpecifications(String drugSpecifications) {
        this.drugSpecifications = drugSpecifications == null ? null : drugSpecifications.trim();
    }

    public String getDoseWayCode() {
        return doseWayCode;
    }

    public void setDoseWayCode(String doseWayCode) {
        this.doseWayCode = doseWayCode == null ? null : doseWayCode.trim();
    }

    public String getDoseWayName() {
        return doseWayName;
    }

    public void setDoseWayName(String doseWayName) {
        this.doseWayName = doseWayName == null ? null : doseWayName.trim();
    }

    public String getDrugUseOneDosage() {
        return drugUseOneDosage;
    }

    public void setDrugUseOneDosage(String drugUseOneDosage) {
        this.drugUseOneDosage = drugUseOneDosage == null ? null : drugUseOneDosage.trim();
    }

    public String getDrugUseOneDosageUnit() {
        return drugUseOneDosageUnit;
    }

    public void setDrugUseOneDosageUnit(String drugUseOneDosageUnit) {
        this.drugUseOneDosageUnit = drugUseOneDosageUnit == null ? null : drugUseOneDosageUnit.trim();
    }

    public String getDrugUseFrequencyCode() {
        return drugUseFrequencyCode;
    }

    public void setDrugUseFrequencyCode(String drugUseFrequencyCode) {
        this.drugUseFrequencyCode = drugUseFrequencyCode == null ? null : drugUseFrequencyCode.trim();
    }

    public String getDrugUseFrequencyName() {
        return drugUseFrequencyName;
    }

    public void setDrugUseFrequencyName(String drugUseFrequencyName) {
        this.drugUseFrequencyName = drugUseFrequencyName == null ? null : drugUseFrequencyName.trim();
    }

    public String getDrugFormCode() {
        return drugFormCode;
    }

    public void setDrugFormCode(String drugFormCode) {
        this.drugFormCode = drugFormCode == null ? null : drugFormCode.trim();
    }

    public String getDrugFormName() {
        return drugFormName;
    }

    public void setDrugFormName(String drugFormName) {
        this.drugFormName = drugFormName == null ? null : drugFormName.trim();
    }

    public String getDrugUnit() {
        return drugUnit;
    }

    public void setDrugUnit(String drugUnit) {
        this.drugUnit = drugUnit == null ? null : drugUnit.trim();
    }

    public String getDrugUnitPrice() {
        return drugUnitPrice;
    }

    public void setDrugUnitPrice(String drugUnitPrice) {
        this.drugUnitPrice = drugUnitPrice == null ? null : drugUnitPrice.trim();
    }

    public String getDrugAbbrev() {
        return drugAbbrev;
    }

    public void setDrugAbbrev(String drugAbbrev) {
        this.drugAbbrev = drugAbbrev == null ? null : drugAbbrev.trim();
    }

    public String getDrugDescr() {
        return drugDescr;
    }

    public void setDrugDescr(String drugDescr) {
        this.drugDescr = drugDescr == null ? null : drugDescr.trim();
    }

    public String getPresSustainedDays() {
        return presSustainedDays;
    }

    public void setPresSustainedDays(String presSustainedDays) {
        this.presSustainedDays = presSustainedDays == null ? null : presSustainedDays.trim();
    }

    public String getDrugAmount() {
        return drugAmount;
    }

    public void setDrugAmount(String drugAmount) {
        this.drugAmount = drugAmount == null ? null : drugAmount.trim();
    }

    public String getBaseAuxDrugFlag() {
        return baseAuxDrugFlag;
    }

    public void setBaseAuxDrugFlag(String baseAuxDrugFlag) {
        this.baseAuxDrugFlag = baseAuxDrugFlag == null ? null : baseAuxDrugFlag.trim();
    }

    public String getSelfDrugFlag() {
        return selfDrugFlag;
    }

    public void setSelfDrugFlag(String selfDrugFlag) {
        this.selfDrugFlag = selfDrugFlag == null ? null : selfDrugFlag.trim();
    }

    public String getGroupFlag() {
        return groupFlag;
    }

    public void setGroupFlag(String groupFlag) {
        this.groupFlag = groupFlag == null ? null : groupFlag.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "OrderDetailInfo{" +
                "presSubNo='" + presSubNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", presNo='" + presNo + '\'' +
                ", presGroupNo='" + presGroupNo + '\'' +
                ", drugCode='" + drugCode + '\'' +
                ", drugName='" + drugName + '\'' +
                ", drugSpecifications='" + drugSpecifications + '\'' +
                ", doseWayCode='" + doseWayCode + '\'' +
                ", doseWayName='" + doseWayName + '\'' +
                ", drugUseOneDosage='" + drugUseOneDosage + '\'' +
                ", drugUseOneDosageUnit='" + drugUseOneDosageUnit + '\'' +
                ", drugUseFrequencyCode='" + drugUseFrequencyCode + '\'' +
                ", drugUseFrequencyName='" + drugUseFrequencyName + '\'' +
                ", drugFormCode='" + drugFormCode + '\'' +
                ", drugFormName='" + drugFormName + '\'' +
                ", drugUnit='" + drugUnit + '\'' +
                ", drugUnitPrice='" + drugUnitPrice + '\'' +
                ", drugAbbrev='" + drugAbbrev + '\'' +
                ", drugDescr='" + drugDescr + '\'' +
                ", presSustainedDays='" + presSustainedDays + '\'' +
                ", drugAmount='" + drugAmount + '\'' +
                ", baseAuxDrugFlag='" + baseAuxDrugFlag + '\'' +
                ", selfDrugFlag='" + selfDrugFlag + '\'' +
                ", groupFlag='" + groupFlag + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}