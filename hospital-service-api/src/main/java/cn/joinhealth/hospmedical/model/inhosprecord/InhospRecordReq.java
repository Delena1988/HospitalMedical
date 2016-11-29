package cn.joinhealth.hospmedical.model.inhosprecord;

import java.io.Serializable;
import java.util.List;

/**
 * Created by linjian
 * 16/11/15
 * 住院记录请求
 */
public class InhospRecordReq implements Serializable {
    private static final long serialVersionUID = 3561549181750744853L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String visitCardNo;//就诊卡号
    private String inhospNo;//住院号
    private String inhospSerialNo;//住院流水号
    private String patName;//患者姓名
    private String idNumber;//身份证号码
    private String mobileNo;//手机号码
    private String deptName;//科室名称
    private List<String> deptCode;//科室代码
    private String wardName;//病区名称
    private List<String> wardCode;//病区代码
    private String sickroomNo;//病房号
    private String bedNo;//病床号
    private String attendDrName;//主治医师姓名
    private String dischargeDiagName;//出院诊断名称
    private List<String> dischargeDiagCode;//出院诊断代码
    private String dischargeStartDate;//出院开始日期时间
    private String dischargeEndDate;//出院结束日期时间
    private String indexNo;//索引号
    private String indexNoType;//索引号类型
    private String admitDiagName;//入院诊断名称
    private List<String> admitDiagCode;//入院诊断代码
    private String admitStartDate;//入院开始日期时间
    private String admitEndDate;//入院结束日期时间
    private String inospStatus = "true";//在院状态 true 出院 false 在院 all所有
    private String diagFlag;//诊断标识 1－只取主诊断  2-所有诊断
    private String statistics;//统计标识
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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<String> getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(List<String> deptCode) {
        this.deptCode = deptCode;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public List<String> getWardCode() {
        return wardCode;
    }

    public void setWardCode(List<String> wardCode) {
        this.wardCode = wardCode;
    }

    public String getSickroomNo() {
        return sickroomNo;
    }

    public void setSickroomNo(String sickroomNo) {
        this.sickroomNo = sickroomNo;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getAttendDrName() {
        return attendDrName;
    }

    public void setAttendDrName(String attendDrName) {
        this.attendDrName = attendDrName;
    }

    public String getDischargeDiagName() {
        return dischargeDiagName;
    }

    public void setDischargeDiagName(String dischargeDiagName) {
        this.dischargeDiagName = dischargeDiagName;
    }

    public List<String> getDischargeDiagCode() {
        return dischargeDiagCode;
    }

    public void setDischargeDiagCode(List<String> dischargeDiagCode) {
        this.dischargeDiagCode = dischargeDiagCode;
    }

    public String getDischargeStartDate() {
        return dischargeStartDate;
    }

    public void setDischargeStartDate(String dischargeStartDate) {
        this.dischargeStartDate = dischargeStartDate;
    }

    public String getDischargeEndDate() {
        return dischargeEndDate;
    }

    public void setDischargeEndDate(String dischargeEndDate) {
        this.dischargeEndDate = dischargeEndDate;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public String getIndexNoType() {
        return indexNoType;
    }

    public void setIndexNoType(String indexNoType) {
        this.indexNoType = indexNoType;
    }

    public String getAdmitDiagName() {
        return admitDiagName;
    }

    public void setAdmitDiagName(String admitDiagName) {
        this.admitDiagName = admitDiagName;
    }

    public List<String> getAdmitDiagCode() {
        return admitDiagCode;
    }

    public void setAdmitDiagCode(List<String> admitDiagCode) {
        this.admitDiagCode = admitDiagCode;
    }

    public String getAdmitStartDate() {
        return admitStartDate;
    }

    public void setAdmitStartDate(String admitStartDate) {
        this.admitStartDate = admitStartDate;
    }

    public String getAdmitEndDate() {
        return admitEndDate;
    }

    public void setAdmitEndDate(String admitEndDate) {
        this.admitEndDate = admitEndDate;
    }

    public String getInospStatus() {
        return inospStatus;
    }

    public void setInospStatus(String inospStatus) {
        this.inospStatus = inospStatus;
    }

    public String getDiagFlag() {
        return diagFlag;
    }

    public void setDiagFlag(String diagFlag) {
        this.diagFlag = diagFlag;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
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
        return "InhospRecordReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptCode=" + deptCode +
                ", wardName='" + wardName + '\'' +
                ", wardCode=" + wardCode +
                ", sickroomNo='" + sickroomNo + '\'' +
                ", bedNo='" + bedNo + '\'' +
                ", attendDrName='" + attendDrName + '\'' +
                ", dischargeDiagName='" + dischargeDiagName + '\'' +
                ", dischargeDiagCode=" + dischargeDiagCode +
                ", dischargeStartDate='" + dischargeStartDate + '\'' +
                ", dischargeEndDate='" + dischargeEndDate + '\'' +
                ", indexNo='" + indexNo + '\'' +
                ", indexNoType='" + indexNoType + '\'' +
                ", admitDiagName='" + admitDiagName + '\'' +
                ", admitDiagCode=" + admitDiagCode +
                ", admitStartDate='" + admitStartDate + '\'' +
                ", admitEndDate='" + admitEndDate + '\'' +
                ", inospStatus='" + inospStatus + '\'' +
                ", diagFlag='" + diagFlag + '\'' +
                ", statistics='" + statistics + '\'' +
                ", dataSourceType=" + dataSourceType +
                ", pageFlag=" + pageFlag +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}