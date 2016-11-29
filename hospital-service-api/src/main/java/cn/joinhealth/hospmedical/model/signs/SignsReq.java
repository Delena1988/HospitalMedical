package cn.joinhealth.hospmedical.model.signs;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 体征信息请求
 */
public class SignsReq implements Serializable {
    private static final long serialVersionUID = 4877161436307046249L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String visitCardNo;//就诊卡号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospSerialNo;//住院流水号
    private String patName;//患者姓名
    private String patTypeName;//患者类别
    private String idNumber;//身份证号
    private String startDate;//开始日期时间
    private String endDate;//结束日期时间
    private String type;//体征类型
    private String normalFlag;//正常标志
    private int dataSourceType;//数据源类型 1、oracle 2、sqlserver 3、mysql

    private Boolean pageFlag = false;//分页标志 false不分页，true分页
    private int pageNum = 0;//当前的页数
    private int pageSize = 0;//每页显示的条数

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

    public String getOuthospNo() {
        return outhospNo;
    }

    public void setOuthospNo(String outhospNo) {
        this.outhospNo = outhospNo;
    }

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo;
    }

    public String getInhospNo() {
        return inhospNo;
    }

    public void setInhospNo(String inhospNo) {
        this.inhospNo = inhospNo;
    }

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getPatTypeName() {
        return patTypeName;
    }

    public void setPatTypeName(String patTypeName) {
        this.patTypeName = patTypeName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNormalFlag() {
        return normalFlag;
    }

    public void setNormalFlag(String normalFlag) {
        this.normalFlag = normalFlag;
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

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "SignsReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", patName='" + patName + '\'' +
                ", patTypeName='" + patTypeName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", type='" + type + '\'' +
                ", normalFlag='" + normalFlag + '\'' +
                ", dataSourceType=" + dataSourceType +
                ", pageFlag=" + pageFlag +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}