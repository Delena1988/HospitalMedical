package com.lanniuh.hospmedical.model.orderinfo;

import java.io.Serializable;

public class OrderInfo implements Serializable{
    private static final long serialVersionUID = 1869224900020534891L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String presNo;//处方号
    private String presGroupNo;//处方组号
    private String presOpenDeptCode;//处方开立科室代码
    private String presOpenDeptName;//处方开立科室名称
    private String presOpenDrCode;//处方开立医生工号
    private String presOpenDrName;//处方开立医生姓名
    private String presOrderDate;//处方开立日期
    private Integer presValidDay;//处方有效天数
    private String presCategCode;//处方类别代码  1-中，2-中成，3-西
    private String presCategName;//处方类别名称
    private String chargeFlag;//收费标志  0-未收费、1-已收费
    private String note;//备注

    public String getPresNo() {
        return presNo;
    }

    public void setPresNo(String presNo) {
        this.presNo = presNo;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo;
    }

    public String getOuthospNo() {
        return outhospNo;
    }

    public void setOuthospNo(String outhospNo) {
        this.outhospNo = outhospNo;
    }

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo;
    }

    public String getPresGroupNo() {
        return presGroupNo;
    }

    public void setPresGroupNo(String presGroupNo) {
        this.presGroupNo = presGroupNo;
    }

    public String getPresOpenDeptCode() {
        return presOpenDeptCode;
    }

    public void setPresOpenDeptCode(String presOpenDeptCode) {
        this.presOpenDeptCode = presOpenDeptCode;
    }

    public String getPresOpenDeptName() {
        return presOpenDeptName;
    }

    public void setPresOpenDeptName(String presOpenDeptName) {
        this.presOpenDeptName = presOpenDeptName;
    }

    public String getPresOpenDrCode() {
        return presOpenDrCode;
    }

    public void setPresOpenDrCode(String presOpenDrCode) {
        this.presOpenDrCode = presOpenDrCode;
    }

    public String getPresOpenDrName() {
        return presOpenDrName;
    }

    public void setPresOpenDrName(String presOpenDrName) {
        this.presOpenDrName = presOpenDrName;
    }

    public String getPresOrderDate() {
        return presOrderDate;
    }

    public void setPresOrderDate(String presOrderDate) {
        this.presOrderDate = presOrderDate;
    }

    public Integer getPresValidDay() {
        return presValidDay;
    }

    public void setPresValidDay(Integer presValidDay) {
        this.presValidDay = presValidDay;
    }

    public String getPresCategCode() {
        return presCategCode;
    }

    public void setPresCategCode(String presCategCode) {
        this.presCategCode = presCategCode;
    }

    public String getPresCategName() {
        return presCategName;
    }

    public void setPresCategName(String presCategName) {
        this.presCategName = presCategName;
    }

    public String getChargeFlag() {
        return chargeFlag;
    }

    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "presNo='" + presNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", presGroupNo='" + presGroupNo + '\'' +
                ", presOpenDeptCode='" + presOpenDeptCode + '\'' +
                ", presOpenDeptName='" + presOpenDeptName + '\'' +
                ", presOpenDrCode='" + presOpenDrCode + '\'' +
                ", presOpenDrName='" + presOpenDrName + '\'' +
                ", presOrderDate='" + presOrderDate + '\'' +
                ", presValidDay=" + presValidDay +
                ", presCategCode='" + presCategCode + '\'' +
                ", presCategName='" + presCategName + '\'' +
                ", chargeFlag='" + chargeFlag + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}