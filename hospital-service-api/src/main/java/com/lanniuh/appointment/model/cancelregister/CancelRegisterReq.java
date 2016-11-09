package com.lanniuh.appointment.model.cancelregister;

import java.io.Serializable;

public class CancelRegisterReq implements Serializable {
    private static final long serialVersionUID = -6409647969130021095L;
    private String organCode;//组织机构代码
    private String schedulingNo;//排班编号
    private String visitDate;//日期
    private String ap;//班次
    private String seqNo;//号源序号
    private String patName;//患者姓名
    private String idNumber;//身份证
    private String password;//取号密码
    private String registerRecordNo;//预约记录序号

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getSchedulingNo() {
        return schedulingNo;
    }

    public void setSchedulingNo(String schedulingNo) {
        this.schedulingNo = schedulingNo;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterRecordNo() {
        return registerRecordNo;
    }

    public void setRegisterRecordNo(String registerRecordNo) {
        this.registerRecordNo = registerRecordNo;
    }

    @Override
    public String toString() {
        return "CancelRegisterReq{" +
                "organCode='" + organCode + '\'' +
                ", schedulingNo='" + schedulingNo + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", ap='" + ap + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", password='" + password + '\'' +
                ", registerRecordNo='" + registerRecordNo + '\'' +
                '}';
    }
}