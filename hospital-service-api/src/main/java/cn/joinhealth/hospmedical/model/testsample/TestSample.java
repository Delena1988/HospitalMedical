package cn.joinhealth.hospmedical.model.testsample;

import java.io.Serializable;

public class TestSample implements Serializable {
    private static final long serialVersionUID = 1964006133969936171L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospNum;//住院次数
    private String inhospSerialNo;//住院流水号
    private String requisitionNo;//申请单编号
    private String requisitionNoItem;//申请单分项目序号
    private String barcodeNo;//条码号
    private String samplingDate;//采样时间
    private String samplingLocation;//采样地点
    private String takeReportDate;//取单时间
    private String takeReportLocation;//取单地点
    private String requisitionPrintDate;//申请单打印时间
    private String note;//备注
    private String relationType;//关联类型  1-门诊号/住院号＋申请单分项目序号（兰溪）；2-申请单编号

    public String getBarcodeNo() {
        return barcodeNo;
    }

    public void setBarcodeNo(String barcodeNo) {
        this.barcodeNo = barcodeNo == null ? null : barcodeNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo == null ? null : patIndexNo.trim();
    }

    public String getOuthospNo() {
        return outhospNo;
    }

    public void setOuthospNo(String outhospNo) {
        this.outhospNo = outhospNo == null ? null : outhospNo.trim();
    }

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo == null ? null : outhospSerialNo.trim();
    }

    public String getInhospNo() {
        return inhospNo;
    }

    public void setInhospNo(String inhospNo) {
        this.inhospNo = inhospNo == null ? null : inhospNo.trim();
    }

    public String getInhospNum() {
        return inhospNum;
    }

    public void setInhospNum(String inhospNum) {
        this.inhospNum = inhospNum == null ? null : inhospNum.trim();
    }

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo == null ? null : inhospSerialNo.trim();
    }

    public String getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(String requisitionNo) {
        this.requisitionNo = requisitionNo == null ? null : requisitionNo.trim();
    }

    public String getRequisitionNoItem() {
        return requisitionNoItem;
    }

    public void setRequisitionNoItem(String requisitionNoItem) {
        this.requisitionNoItem = requisitionNoItem == null ? null : requisitionNoItem.trim();
    }

    public String getSamplingDate() {
        return samplingDate;
    }

    public void setSamplingDate(String samplingDate) {
        this.samplingDate = samplingDate == null ? null : samplingDate.trim();
    }

    public String getSamplingLocation() {
        return samplingLocation;
    }

    public void setSamplingLocation(String samplingLocation) {
        this.samplingLocation = samplingLocation == null ? null : samplingLocation.trim();
    }

    public String getTakeReportDate() {
        return takeReportDate;
    }

    public void setTakeReportDate(String takeReportDate) {
        this.takeReportDate = takeReportDate == null ? null : takeReportDate.trim();
    }

    public String getTakeReportLocation() {
        return takeReportLocation;
    }

    public void setTakeReportLocation(String takeReportLocation) {
        this.takeReportLocation = takeReportLocation == null ? null : takeReportLocation.trim();
    }

    public String getRequisitionPrintDate() {
        return requisitionPrintDate;
    }

    public void setRequisitionPrintDate(String requisitionPrintDate) {
        this.requisitionPrintDate = requisitionPrintDate == null ? null : requisitionPrintDate.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType == null ? null : relationType.trim();
    }

    @Override
    public String toString() {
        return "TestSample{" +
                "barcodeNo='" + barcodeNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", requisitionNo='" + requisitionNo + '\'' +
                ", requisitionNoItem='" + requisitionNoItem + '\'' +
                ", samplingDate='" + samplingDate + '\'' +
                ", samplingLocation='" + samplingLocation + '\'' +
                ", takeReportDate='" + takeReportDate + '\'' +
                ", takeReportLocation='" + takeReportLocation + '\'' +
                ", requisitionPrintDate='" + requisitionPrintDate + '\'' +
                ", note='" + note + '\'' +
                ", relationType='" + relationType + '\'' +
                '}';
    }
}