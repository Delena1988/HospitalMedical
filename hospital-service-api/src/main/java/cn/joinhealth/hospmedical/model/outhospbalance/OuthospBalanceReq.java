package cn.joinhealth.hospmedical.model.outhospbalance;

import java.io.Serializable;
import java.util.List;

/**
 * Created by linjian
 * 16/11/15
 * 门诊费用结算请求
 */
public class OuthospBalanceReq implements Serializable{
    private static final long serialVersionUID = 5098141868383103811L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private List<String> dealNo;//交易流水号
    private int dataSourceType;//数据源类型 1、oracle 2、sqlserver 3、mysql

    public int getSysCode() {
        return sysCode;
    }

    public void setSysCode(int sysCode) {
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

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "OuthospBalanceReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", dealNo=" + dealNo +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}