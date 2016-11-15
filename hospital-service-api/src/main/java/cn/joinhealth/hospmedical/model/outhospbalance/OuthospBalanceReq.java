package cn.joinhealth.hospmedical.model.outhospbalance;

import java.io.Serializable;
import java.util.List;

public class OuthospBalanceReq implements Serializable{
    private static final long serialVersionUID = 5098141868383103811L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private List<String> dealNo;//交易流水号

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

    @Override
    public String toString() {
        return "OuthospBalanceReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", dealNo=" + dealNo +
                '}';
    }
}