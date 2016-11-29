package cn.joinhealth.appointment.model.registerhistory;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 预约记录请求
 */
public class RegisterHistoryReq implements Serializable{
    private static final long serialVersionUID = 5786115568239200974L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
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
        return "RegisterHistoryReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}