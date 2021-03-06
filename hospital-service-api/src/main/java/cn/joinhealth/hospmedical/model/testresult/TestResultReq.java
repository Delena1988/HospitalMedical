package cn.joinhealth.hospmedical.model.testresult;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 检验结果请求
 */
public class TestResultReq implements Serializable{
    private static final long serialVersionUID = 2601219060385196741L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String reportNo;//报告单编号
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

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "TestResultReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", reportNo='" + reportNo + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}