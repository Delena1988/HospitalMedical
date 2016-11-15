package cn.joinhealth.hospmedical.model.examreport;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 检查报告请求
 */
public class ExamReportReq implements Serializable {
    private static final long serialVersionUID = -1941141493742102648L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospSerialNo;//住院流水号
    private String requisitionNo;//申请单编号
    private String applyDeptCode;//申请科室工号
    private String applyDeptName;//申请科室名称
    private String applyDrCode;//申请医生工号
    private String applyDrName;//申请医生姓名
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

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo;
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

    public String getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(String requisitionNo) {
        this.requisitionNo = requisitionNo;
    }

    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode;
    }

    public String getApplyDeptName() {
        return applyDeptName;
    }

    public void setApplyDeptName(String applyDeptName) {
        this.applyDeptName = applyDeptName;
    }

    public String getApplyDrCode() {
        return applyDrCode;
    }

    public void setApplyDrCode(String applyDrCode) {
        this.applyDrCode = applyDrCode;
    }

    public String getApplyDrName() {
        return applyDrName;
    }

    public void setApplyDrName(String applyDrName) {
        this.applyDrName = applyDrName;
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
        return "ExamReportReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", requisitionNo='" + requisitionNo + '\'' +
                ", applyDeptCode='" + applyDeptCode + '\'' +
                ", applyDeptName='" + applyDeptName + '\'' +
                ", applyDrCode='" + applyDrCode + '\'' +
                ", applyDrName='" + applyDrName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}