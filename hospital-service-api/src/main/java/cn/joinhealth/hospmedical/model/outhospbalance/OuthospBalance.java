package cn.joinhealth.hospmedical.model.outhospbalance;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 门诊费用结算
 */
public class OuthospBalance implements Serializable {
    private static final long serialVersionUID = -8891879920850364576L;
    private String organCode;//组织机构代码
    private String dealNo;//交易流水号
    private String balanceNo;//结算流水号
    private String feeCategCode;//费用类别代码
    private String feeCategName;//费用类别名称
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

    public String getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo == null ? null : balanceNo.trim();
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

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "OuthospBalance{" +
                "dealNo='" + dealNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", balanceNo='" + balanceNo + '\'' +
                ", feeCategCode='" + feeCategCode + '\'' +
                ", feeCategName='" + feeCategName + '\'' +
                ", totalMoney=" + totalMoney +
                '}';
    }
}