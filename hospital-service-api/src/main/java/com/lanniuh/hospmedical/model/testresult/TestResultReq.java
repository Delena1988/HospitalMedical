package com.lanniuh.hospmedical.model.testresult;

import java.io.Serializable;

public class TestResultReq implements Serializable{
    private static final long serialVersionUID = 2601219060385196741L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String reportNo;//报告单编号

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

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }

    @Override
    public String toString() {
        return "TestResultReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", reportNo='" + reportNo + '\'' +
                '}';
    }
}