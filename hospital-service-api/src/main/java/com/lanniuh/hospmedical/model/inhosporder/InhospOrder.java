package com.lanniuh.hospmedical.model.inhosporder;

import java.io.Serializable;

public class InhospOrder implements Serializable {
    private static final long serialVersionUID = 2945841478203468955L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String inhospNo;//住院号
    private String inhospNum;//住院次数
    private String inhospSerialNo;//住院流水号
    private String orderNo;//医嘱号
    private String orderGroupNo;//医嘱组号
    private String orderPlanBeginDate;//医嘱计划开始日期
    private String orderPlanEndDate;//医嘱计划结束日期
    private String orderBeginDate;//医嘱开始日期
    private String orderEndDate;//医嘱结束日期
    private String orderOrderDate;//医嘱开立日期
    private String orderOpenDeptCode;//医嘱开立科室代码
    private String orderOpenDeptName;//医嘱开立科室名称
    private String orderOpenDrCode;//医嘱开立医生工号
    private String orderOpenDrName;//医嘱开立医生姓名
    private String orderExecuteDate;//医嘱执行日期
    private String orderItemTypeCode;//医嘱项目类型代码
    private String orderItemTypeName;//医嘱项目类型名称
    private String orderCategCode;//医嘱类别代码
    private String orderCategName;//医嘱类别名称
    private String orderItemCode;//医嘱项目代码
    private String orderItemName;//医嘱项目名称
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
    private String drugAmount;//药品数量
    private String orderDuration;//医嘱持续时间
    private String orderDurationUnit;//医嘱持续时间单位
    private String baseAuxDrugFlag;//主副药标志  0、非主药 1、主药
    private String dischargeOrderFlag;//出院医嘱标志  0、非出院医嘱 1、出院医嘱
    private String drEntrust;//医生嘱托
    private String note;//备注

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo == null ? null : inhospSerialNo.trim();
    }

    public String getOrderGroupNo() {
        return orderGroupNo;
    }

    public void setOrderGroupNo(String orderGroupNo) {
        this.orderGroupNo = orderGroupNo == null ? null : orderGroupNo.trim();
    }

    public String getOrderPlanBeginDate() {
        return orderPlanBeginDate;
    }

    public void setOrderPlanBeginDate(String orderPlanBeginDate) {
        this.orderPlanBeginDate = orderPlanBeginDate == null ? null : orderPlanBeginDate.trim();
    }

    public String getOrderPlanEndDate() {
        return orderPlanEndDate;
    }

    public void setOrderPlanEndDate(String orderPlanEndDate) {
        this.orderPlanEndDate = orderPlanEndDate == null ? null : orderPlanEndDate.trim();
    }

    public String getOrderBeginDate() {
        return orderBeginDate;
    }

    public void setOrderBeginDate(String orderBeginDate) {
        this.orderBeginDate = orderBeginDate == null ? null : orderBeginDate.trim();
    }

    public String getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(String orderEndDate) {
        this.orderEndDate = orderEndDate == null ? null : orderEndDate.trim();
    }

    public String getOrderOrderDate() {
        return orderOrderDate;
    }

    public void setOrderOrderDate(String orderOrderDate) {
        this.orderOrderDate = orderOrderDate == null ? null : orderOrderDate.trim();
    }

    public String getOrderOpenDeptCode() {
        return orderOpenDeptCode;
    }

    public void setOrderOpenDeptCode(String orderOpenDeptCode) {
        this.orderOpenDeptCode = orderOpenDeptCode == null ? null : orderOpenDeptCode.trim();
    }

    public String getOrderOpenDeptName() {
        return orderOpenDeptName;
    }

    public void setOrderOpenDeptName(String orderOpenDeptName) {
        this.orderOpenDeptName = orderOpenDeptName == null ? null : orderOpenDeptName.trim();
    }

    public String getOrderOpenDrCode() {
        return orderOpenDrCode;
    }

    public void setOrderOpenDrCode(String orderOpenDrCode) {
        this.orderOpenDrCode = orderOpenDrCode == null ? null : orderOpenDrCode.trim();
    }

    public String getOrderOpenDrName() {
        return orderOpenDrName;
    }

    public void setOrderOpenDrName(String orderOpenDrName) {
        this.orderOpenDrName = orderOpenDrName == null ? null : orderOpenDrName.trim();
    }

    public String getOrderExecuteDate() {
        return orderExecuteDate;
    }

    public void setOrderExecuteDate(String orderExecuteDate) {
        this.orderExecuteDate = orderExecuteDate == null ? null : orderExecuteDate.trim();
    }

    public String getOrderItemTypeCode() {
        return orderItemTypeCode;
    }

    public void setOrderItemTypeCode(String orderItemTypeCode) {
        this.orderItemTypeCode = orderItemTypeCode == null ? null : orderItemTypeCode.trim();
    }

    public String getOrderItemTypeName() {
        return orderItemTypeName;
    }

    public void setOrderItemTypeName(String orderItemTypeName) {
        this.orderItemTypeName = orderItemTypeName == null ? null : orderItemTypeName.trim();
    }

    public String getOrderCategCode() {
        return orderCategCode;
    }

    public void setOrderCategCode(String orderCategCode) {
        this.orderCategCode = orderCategCode == null ? null : orderCategCode.trim();
    }

    public String getOrderCategName() {
        return orderCategName;
    }

    public void setOrderCategName(String orderCategName) {
        this.orderCategName = orderCategName == null ? null : orderCategName.trim();
    }

    public String getOrderItemCode() {
        return orderItemCode;
    }

    public void setOrderItemCode(String orderItemCode) {
        this.orderItemCode = orderItemCode == null ? null : orderItemCode.trim();
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName == null ? null : orderItemName.trim();
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

    public String getDrugAmount() {
        return drugAmount;
    }

    public void setDrugAmount(String drugAmount) {
        this.drugAmount = drugAmount == null ? null : drugAmount.trim();
    }

    public String getOrderDuration() {
        return orderDuration;
    }

    public void setOrderDuration(String orderDuration) {
        this.orderDuration = orderDuration == null ? null : orderDuration.trim();
    }

    public String getOrderDurationUnit() {
        return orderDurationUnit;
    }

    public void setOrderDurationUnit(String orderDurationUnit) {
        this.orderDurationUnit = orderDurationUnit == null ? null : orderDurationUnit.trim();
    }

    public String getBaseAuxDrugFlag() {
        return baseAuxDrugFlag;
    }

    public void setBaseAuxDrugFlag(String baseAuxDrugFlag) {
        this.baseAuxDrugFlag = baseAuxDrugFlag == null ? null : baseAuxDrugFlag.trim();
    }

    public String getDischargeOrderFlag() {
        return dischargeOrderFlag;
    }

    public void setDischargeOrderFlag(String dischargeOrderFlag) {
        this.dischargeOrderFlag = dischargeOrderFlag == null ? null : dischargeOrderFlag.trim();
    }

    public String getDrEntrust() {
        return drEntrust;
    }

    public void setDrEntrust(String drEntrust) {
        this.drEntrust = drEntrust == null ? null : drEntrust.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "InhospOrder{" +
                "orderNo='" + orderNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", orderGroupNo='" + orderGroupNo + '\'' +
                ", orderPlanBeginDate='" + orderPlanBeginDate + '\'' +
                ", orderPlanEndDate='" + orderPlanEndDate + '\'' +
                ", orderBeginDate='" + orderBeginDate + '\'' +
                ", orderEndDate='" + orderEndDate + '\'' +
                ", orderOrderDate='" + orderOrderDate + '\'' +
                ", orderOpenDeptCode='" + orderOpenDeptCode + '\'' +
                ", orderOpenDeptName='" + orderOpenDeptName + '\'' +
                ", orderOpenDrCode='" + orderOpenDrCode + '\'' +
                ", orderOpenDrName='" + orderOpenDrName + '\'' +
                ", orderExecuteDate='" + orderExecuteDate + '\'' +
                ", orderItemTypeCode='" + orderItemTypeCode + '\'' +
                ", orderItemTypeName='" + orderItemTypeName + '\'' +
                ", orderCategCode='" + orderCategCode + '\'' +
                ", orderCategName='" + orderCategName + '\'' +
                ", orderItemCode='" + orderItemCode + '\'' +
                ", orderItemName='" + orderItemName + '\'' +
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
                ", drugAmount='" + drugAmount + '\'' +
                ", orderDuration='" + orderDuration + '\'' +
                ", orderDurationUnit='" + orderDurationUnit + '\'' +
                ", baseAuxDrugFlag='" + baseAuxDrugFlag + '\'' +
                ", dischargeOrderFlag='" + dischargeOrderFlag + '\'' +
                ", drEntrust='" + drEntrust + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}