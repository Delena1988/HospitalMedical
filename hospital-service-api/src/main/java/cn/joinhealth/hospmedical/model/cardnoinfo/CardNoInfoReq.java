package cn.joinhealth.hospmedical.model.cardnoinfo;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 卡号信息请求
 */
public class CardNoInfoReq implements Serializable {
    private static final long serialVersionUID = -8327107080835318904L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String visitCardNo;//就诊卡号或住院号
    private String patIndexNo;//患者索引号
    private String visitCardType;//就诊卡类别
    private String patName;//患者姓名
    private String idNumber;//身份证号
    private String invalidFlag;//作废标志
    private String startDate;//开卡日期  开始时间
    private String endDate;//开卡日期  结束时间
    private int dataSourceType;//数据源类型 1、oracle 2、sqlserver 3、mysql

    public int getSysCode() {
        return sysCode;
    }

    public void setSysCode(int sysCode) {
        this.sysCode = sysCode;
    }

    public String getVisitCardNo() {
        return visitCardNo;
    }

    public void setVisitCardNo(String visitCardNo) {
        this.visitCardNo = visitCardNo;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo;
    }

    public String getVisitCardType() {
        return visitCardType;
    }

    public void setVisitCardType(String visitCardType) {
        this.visitCardType = visitCardType;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(String invalidFlag) {
        this.invalidFlag = invalidFlag;
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
        return "CardNoInfoReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardType='" + visitCardType + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", invalidFlag='" + invalidFlag + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}