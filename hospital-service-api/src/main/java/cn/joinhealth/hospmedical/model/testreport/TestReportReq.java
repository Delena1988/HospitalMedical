package cn.joinhealth.hospmedical.model.testreport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by linjian
 * 16/11/15
 * 检验报告请求
 */
public class TestReportReq implements Serializable{
    private static final long serialVersionUID = 6419073937114981087L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospSerialNo;//住院流水号
    private String requisitionNo;//申请单编号
    private String requisitionNoItem;//申请单分项目序号
    private String applyDrName;//申请医生姓名
    private String applyDeptName;//申请科室名称
    private String startDate;//开始日期时间
    private String endDate;//结束日期时间
    private List<String> barcodeNo;//条码号
    private String reportNo;//报告单好
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

    public String getRequisitionNoItem() {
        return requisitionNoItem;
    }

    public void setRequisitionNoItem(String requisitionNoItem) {
        this.requisitionNoItem = requisitionNoItem;
    }

    public String getApplyDrName() {
        return applyDrName;
    }

    public void setApplyDrName(String applyDrName) {
        this.applyDrName = applyDrName;
    }

    public String getApplyDeptName() {
        return applyDeptName;
    }

    public void setApplyDeptName(String applyDeptName) {
        this.applyDeptName = applyDeptName;
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

    public List<String> getBarcodeNo() {
        return barcodeNo;
    }

    public void setBarcodeNo(List<String> barcodeNo) {
        this.barcodeNo = barcodeNo;
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
        return "TestReportReq{" +
                "sysCode=" + sysCode +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", requisitionNo='" + requisitionNo + '\'' +
                ", requisitionNoItem='" + requisitionNoItem + '\'' +
                ", applyDrName='" + applyDrName + '\'' +
                ", applyDeptName='" + applyDeptName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", barcodeNo=" + barcodeNo +
                ", reportNo='" + reportNo + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}