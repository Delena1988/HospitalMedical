package com.lanniuh.hospmedical.model.inhospfeedetail;

import java.io.Serializable;
import java.util.List;

public class InhospFeeDetailReq implements Serializable{
    private static final long serialVersionUID = 2971277925848605578L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private List<String> dealNo;// 交易流水号
    private String feeCategCode;//费用类别代码

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public List<String> getDealNo() {
        return dealNo;
    }

    public void setDealNo(List<String> dealNo) {
        this.dealNo = dealNo;
    }

    public String getFeeCategCode() {
        return feeCategCode;
    }

    public void setFeeCategCode(String feeCategCode) {
        this.feeCategCode = feeCategCode;
    }

    @Override
    public String toString() {
        return "InhospFeeDetailReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", dealNo=" + dealNo +
                ", feeCategCode='" + feeCategCode + '\'' +
                '}';
    }
}