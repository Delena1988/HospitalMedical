package cn.joinhealth.hospmedical.model.physicalexamresult;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 体检结果请求
 */
public class PhysicalExamResultReq implements Serializable{
    private static final long serialVersionUID = -3801135180958313828L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String reportNo;//体检报告号
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
        return "PhysicalExamResultReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", reportNo='" + reportNo + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}