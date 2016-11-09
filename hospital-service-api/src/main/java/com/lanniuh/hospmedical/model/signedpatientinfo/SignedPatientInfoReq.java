package com.lanniuh.hospmedical.model.signedpatientinfo;

import java.io.Serializable;

public class SignedPatientInfoReq implements Serializable {
    private static final long serialVersionUID = 668607755926889825L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String visitCardNo;//就诊卡号
    private String patName;//患者姓名
    private String idNumber;//身份证号码
    private String mobileNo;//联系电话
    private String signedDrCode;//签约医生工号
    private String signedDrName;//签约医生姓名
    private String startDate;//开始日期时间
    private String endDate;//结束日期时间
    private String ageStart;//开始年龄
    private String ageEnd;//结束年龄
    private String diagName;//诊断名称

    private Boolean pageFlag = false;//分页标志 false不分页，true分页
    private int pageNum = 0;//当前的页数
    private int pageSize = 0;//每页显示的条数

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

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo;
    }

    public String getVisitCardNo() {
        return visitCardNo;
    }

    public void setVisitCardNo(String visitCardNo) {
        this.visitCardNo = visitCardNo;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getSignedDrCode() {
        return signedDrCode;
    }

    public void setSignedDrCode(String signedDrCode) {
        this.signedDrCode = signedDrCode;
    }

    public String getSignedDrName() {
        return signedDrName;
    }

    public void setSignedDrName(String signedDrName) {
        this.signedDrName = signedDrName;
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

    public String getAgeStart() {
        return ageStart;
    }

    public void setAgeStart(String ageStart) {
        this.ageStart = ageStart;
    }

    public String getAgeEnd() {
        return ageEnd;
    }

    public void setAgeEnd(String ageEnd) {
        this.ageEnd = ageEnd;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public Boolean getPageFlag() {
        return pageFlag;
    }

    public void setPageFlag(Boolean pageFlag) {
        this.pageFlag = pageFlag;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "SignedPatientInfoReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", signedDrCode='" + signedDrCode + '\'' +
                ", signedDrName='" + signedDrName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", ageStart='" + ageStart + '\'' +
                ", ageEnd='" + ageEnd + '\'' +
                ", diagName='" + diagName + '\'' +
                ", pageFlag=" + pageFlag +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}