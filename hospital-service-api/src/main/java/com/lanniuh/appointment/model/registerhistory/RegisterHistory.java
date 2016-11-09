package com.lanniuh.appointment.model.registerhistory;

import java.io.Serializable;

public class RegisterHistory implements Serializable {
    private static final long serialVersionUID = -7524644634749110222L;
    private String organCode;//组织机构代码
    private String schedulingNo;//排班编号
    private String ap;//班次
    private String seqNo;//号源序号
    private String deptCode;//科室代码
    private String deptName;//科室名称
    private String drCode;//医生工号
    private String drName;//医生姓名
    private String patName;//姓名
    private String idNumber;//身份证
    private String mobileNo;//手机号
    private String visitCardNo;//就诊卡号
    private String status;//预约状态
    private String visitDate;//预约日期
    private String takeNoTime;//取号时间

    public String getSchedulingNo() {
        return schedulingNo;
    }

    public void setSchedulingNo(String schedulingNo) {
        this.schedulingNo = schedulingNo == null ? null : schedulingNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap == null ? null : ap.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDrCode() {
        return drCode;
    }

    public void setDrCode(String drCode) {
        this.drCode = drCode == null ? null : drCode.trim();
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName == null ? null : drName.trim();
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName == null ? null : patName.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getVisitCardNo() {
        return visitCardNo;
    }

    public void setVisitCardNo(String visitCardNo) {
        this.visitCardNo = visitCardNo == null ? null : visitCardNo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate == null ? null : visitDate.trim();
    }

    public String getTakeNoTime() {
        return takeNoTime;
    }

    public void setTakeNoTime(String takeNoTime) {
        this.takeNoTime = takeNoTime == null ? null : takeNoTime.trim();
    }

    @Override
    public String toString() {
        return "RegisterHistory{" +
                "schedulingNo='" + schedulingNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", ap='" + ap + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", drCode='" + drCode + '\'' +
                ", drName='" + drName + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", status='" + status + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", takeNoTime='" + takeNoTime + '\'' +
                '}';
    }
}