package cn.joinhealth.hospmedical.model.outhospfee;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 门诊费用请求
 */
public class OuthospFeeReq implements Serializable{
    private static final long serialVersionUID = -826419171317496145L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String outhospSerialNo;//门诊流水号
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

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "OuthospFeeReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}