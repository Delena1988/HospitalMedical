package cn.joinhealth.hospmedical.model.orderinfo;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 处方信息请求
 */
public class OrderInfoReq implements Serializable{
    private static final long serialVersionUID = 7548576181453201265L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String outhospSerialNo;//门诊流水号
    private String startDate;//开始日期时间
    private String endDate;//结束日期时间
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "OrderInfoReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}