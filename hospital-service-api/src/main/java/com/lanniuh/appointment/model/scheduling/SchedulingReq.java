package com.lanniuh.appointment.model.scheduling;

import java.io.Serializable;

public class SchedulingReq implements Serializable{
    private static final long serialVersionUID = 1740775795935785546L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String startDate;//开始日期时间
    private String endDate;//结束日期时间

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

    @Override
    public String toString() {
        return "SchedulingReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}