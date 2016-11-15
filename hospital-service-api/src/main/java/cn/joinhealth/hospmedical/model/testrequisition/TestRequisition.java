package cn.joinhealth.hospmedical.model.testrequisition;

import java.io.Serializable;

public class TestRequisition implements Serializable{
    private static final long serialVersionUID = 4760293404436552387L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospNum;//住院次数
    private String inhospSerialNo;//住院流水号
    private String requisitionNo;//申请单编号
    private String requisitionNoItem;//申请单分项目序号
    private String applyDate;//申请日期
    private String testApplyItemCode;//检验申请项目名称
    private String testApplyItemName;//检验申请项目名称
    private String requisitionStatus;//申请单状态
    private String note;//备注

    public String getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(String requisitionNo) {
        this.requisitionNo = requisitionNo == null ? null : requisitionNo.trim();
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

    public String getRequisitionNoItem() {
        return requisitionNoItem;
    }

    public void setRequisitionNoItem(String requisitionNoItem) {
        this.requisitionNoItem = requisitionNoItem == null ? null : requisitionNoItem.trim();
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getTestApplyItemCode() {
        return testApplyItemCode;
    }

    public void setTestApplyItemCode(String testApplyItemCode) {
        this.testApplyItemCode = testApplyItemCode == null ? null : testApplyItemCode.trim();
    }

    public String getTestApplyItemName() {
        return testApplyItemName;
    }

    public void setTestApplyItemName(String testApplyItemName) {
        this.testApplyItemName = testApplyItemName == null ? null : testApplyItemName.trim();
    }

    public String getRequisitionStatus() {
        return requisitionStatus;
    }

    public void setRequisitionStatus(String requisitionStatus) {
        this.requisitionStatus = requisitionStatus == null ? null : requisitionStatus.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "TestRequisition{" +
                "requisitionNo='" + requisitionNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", requisitionNoItem='" + requisitionNoItem + '\'' +
                ", applyDate=" + applyDate +
                ", testApplyItemCode='" + testApplyItemCode + '\'' +
                ", testApplyItemName='" + testApplyItemName + '\'' +
                ", requisitionStatus='" + requisitionStatus + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}