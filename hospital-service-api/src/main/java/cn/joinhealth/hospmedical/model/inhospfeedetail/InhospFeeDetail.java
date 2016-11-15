package cn.joinhealth.hospmedical.model.inhospfeedetail;


import java.io.Serializable;

public class InhospFeeDetail implements Serializable {
    private static final long serialVersionUID = -6083308887859012132L;
    private String organCode;//组织机构代码
    private String dealNo;//医嘱号
    private String orderNo;//交易流水号
    private String dealSubNo;//交易流水子序号
    private String chargeItemCode;//收费项目代码
    private String chargeItemName;//收费项目名称
    private String feeCategCode;//费用类别代码
    private String feeCategName;//费用类别名称  西药费、治疗费、手术费……
    private String drugCatalogType;//药品目录类别  甲、乙、丙
    private String drugAmount;//药品数量
    private String drugUnit;//药品单位
    private String drugUnitPrice;//药品单价
    private String selfPercent;//自理自费％  自理自费百分比
    private String totalMoney;//总金额

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getDealSubNo() {
        return dealSubNo;
    }

    public void setDealSubNo(String dealSubNo) {
        this.dealSubNo = dealSubNo == null ? null : dealSubNo.trim();
    }

    public String getChargeItemCode() {
        return chargeItemCode;
    }

    public void setChargeItemCode(String chargeItemCode) {
        this.chargeItemCode = chargeItemCode == null ? null : chargeItemCode.trim();
    }

    public String getChargeItemName() {
        return chargeItemName;
    }

    public void setChargeItemName(String chargeItemName) {
        this.chargeItemName = chargeItemName == null ? null : chargeItemName.trim();
    }

    public String getFeeCategCode() {
        return feeCategCode;
    }

    public void setFeeCategCode(String feeCategCode) {
        this.feeCategCode = feeCategCode == null ? null : feeCategCode.trim();
    }

    public String getFeeCategName() {
        return feeCategName;
    }

    public void setFeeCategName(String feeCategName) {
        this.feeCategName = feeCategName == null ? null : feeCategName.trim();
    }

    public String getDrugCatalogType() {
        return drugCatalogType;
    }

    public void setDrugCatalogType(String drugCatalogType) {
        this.drugCatalogType = drugCatalogType == null ? null : drugCatalogType.trim();
    }

    public String getDrugAmount() {
        return drugAmount;
    }

    public void setDrugAmount(String drugAmount) {
        this.drugAmount = drugAmount == null ? null : drugAmount.trim();
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

    public String getSelfPercent() {
        return selfPercent;
    }

    public void setSelfPercent(String selfPercent) {
        this.selfPercent = selfPercent == null ? null : selfPercent.trim();
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney == null ? null : totalMoney.trim();
    }

    @Override
    public String toString() {
        return "InhospFeeDetail{" +
                "dealNo='" + dealNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", dealSubNo='" + dealSubNo + '\'' +
                ", chargeItemCode='" + chargeItemCode + '\'' +
                ", chargeItemName='" + chargeItemName + '\'' +
                ", feeCategCode='" + feeCategCode + '\'' +
                ", feeCategName='" + feeCategName + '\'' +
                ", drugCatalogType='" + drugCatalogType + '\'' +
                ", drugAmount='" + drugAmount + '\'' +
                ", drugUnit='" + drugUnit + '\'' +
                ", drugUnitPrice='" + drugUnitPrice + '\'' +
                ", selfPercent='" + selfPercent + '\'' +
                ", totalMoney='" + totalMoney + '\'' +
                '}';
    }
}