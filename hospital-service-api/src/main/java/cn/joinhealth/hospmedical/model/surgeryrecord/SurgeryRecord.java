package cn.joinhealth.hospmedical.model.surgeryrecord;

import java.io.Serializable;

public class SurgeryRecord implements Serializable {
    private static final long serialVersionUID = 8574997217382443870L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospNum;//住院次数
    private String inhospSerialNo;//住院流水号
    private String surgeryNo;//手术流水号
    private String surgerySeqNo;//手术序号
    private String surgeryOperCode;//手术(操作)代码
    private String surgeryOperName;//手术(操作)名称
    private String surgeryLevelCode;//手术级别代码
    private String surgeryLevelName;//手术级别名称
    private String surgeryWoundCategCode;//手术切口类别代码
    private String surgeryWoundCategName;//手术切口类别名称
    private String woundHealingLevelCode;//手术切口愈合等级代码
    private String woundHealingLevelName;//手术切口愈合等级名称
    private String surgeryBeginDate;//手术开始日期
    private String surgeryEndDate;//手术结束日期
    private String surgeryDrCode;//手术医生工号
    private String surgeryDrName;//手术医生姓名
    private String anesMethodCode;//麻醉方式代码
    private String anesMethodName;//麻醉方式名称
    private String anesDrCode;//麻醉医生工号
    private String anesDrName;//麻醉医生姓名

    public String getSurgeryNo() {
        return surgeryNo;
    }

    public void setSurgeryNo(String surgeryNo) {
        this.surgeryNo = surgeryNo == null ? null : surgeryNo.trim();
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

    public String getSurgerySeqNo() {
        return surgerySeqNo;
    }

    public void setSurgerySeqNo(String surgerySeqNo) {
        this.surgerySeqNo = surgerySeqNo == null ? null : surgerySeqNo.trim();
    }

    public String getSurgeryOperCode() {
        return surgeryOperCode;
    }

    public void setSurgeryOperCode(String surgeryOperCode) {
        this.surgeryOperCode = surgeryOperCode == null ? null : surgeryOperCode.trim();
    }

    public String getSurgeryOperName() {
        return surgeryOperName;
    }

    public void setSurgeryOperName(String surgeryOperName) {
        this.surgeryOperName = surgeryOperName == null ? null : surgeryOperName.trim();
    }

    public String getSurgeryLevelCode() {
        return surgeryLevelCode;
    }

    public void setSurgeryLevelCode(String surgeryLevelCode) {
        this.surgeryLevelCode = surgeryLevelCode == null ? null : surgeryLevelCode.trim();
    }

    public String getSurgeryLevelName() {
        return surgeryLevelName;
    }

    public void setSurgeryLevelName(String surgeryLevelName) {
        this.surgeryLevelName = surgeryLevelName == null ? null : surgeryLevelName.trim();
    }

    public String getSurgeryWoundCategCode() {
        return surgeryWoundCategCode;
    }

    public void setSurgeryWoundCategCode(String surgeryWoundCategCode) {
        this.surgeryWoundCategCode = surgeryWoundCategCode == null ? null : surgeryWoundCategCode.trim();
    }

    public String getSurgeryWoundCategName() {
        return surgeryWoundCategName;
    }

    public void setSurgeryWoundCategName(String surgeryWoundCategName) {
        this.surgeryWoundCategName = surgeryWoundCategName == null ? null : surgeryWoundCategName.trim();
    }

    public String getWoundHealingLevelCode() {
        return woundHealingLevelCode;
    }

    public void setWoundHealingLevelCode(String woundHealingLevelCode) {
        this.woundHealingLevelCode = woundHealingLevelCode == null ? null : woundHealingLevelCode.trim();
    }

    public String getWoundHealingLevelName() {
        return woundHealingLevelName;
    }

    public void setWoundHealingLevelName(String woundHealingLevelName) {
        this.woundHealingLevelName = woundHealingLevelName == null ? null : woundHealingLevelName.trim();
    }

    public String getSurgeryBeginDate() {
        return surgeryBeginDate;
    }

    public void setSurgeryBeginDate(String surgeryBeginDate) {
        this.surgeryBeginDate = surgeryBeginDate == null ? null : surgeryBeginDate.trim();
    }

    public String getSurgeryEndDate() {
        return surgeryEndDate;
    }

    public void setSurgeryEndDate(String surgeryEndDate) {
        this.surgeryEndDate = surgeryEndDate == null ? null : surgeryEndDate.trim();
    }

    public String getSurgeryDrCode() {
        return surgeryDrCode;
    }

    public void setSurgeryDrCode(String surgeryDrCode) {
        this.surgeryDrCode = surgeryDrCode == null ? null : surgeryDrCode.trim();
    }

    public String getSurgeryDrName() {
        return surgeryDrName;
    }

    public void setSurgeryDrName(String surgeryDrName) {
        this.surgeryDrName = surgeryDrName == null ? null : surgeryDrName.trim();
    }

    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode == null ? null : anesMethodCode.trim();
    }

    public String getAnesMethodName() {
        return anesMethodName;
    }

    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName == null ? null : anesMethodName.trim();
    }

    public String getAnesDrCode() {
        return anesDrCode;
    }

    public void setAnesDrCode(String anesDrCode) {
        this.anesDrCode = anesDrCode == null ? null : anesDrCode.trim();
    }

    public String getAnesDrName() {
        return anesDrName;
    }

    public void setAnesDrName(String anesDrName) {
        this.anesDrName = anesDrName == null ? null : anesDrName.trim();
    }

    @Override
    public String toString() {
        return "SurgeryRecord{" +
                "surgeryNo='" + surgeryNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", surgerySeqNo='" + surgerySeqNo + '\'' +
                ", surgeryOperCode='" + surgeryOperCode + '\'' +
                ", surgeryOperName='" + surgeryOperName + '\'' +
                ", surgeryLevelCode='" + surgeryLevelCode + '\'' +
                ", surgeryLevelName='" + surgeryLevelName + '\'' +
                ", surgeryWoundCategCode='" + surgeryWoundCategCode + '\'' +
                ", surgeryWoundCategName='" + surgeryWoundCategName + '\'' +
                ", woundHealingLevelCode='" + woundHealingLevelCode + '\'' +
                ", woundHealingLevelName='" + woundHealingLevelName + '\'' +
                ", surgeryBeginDate='" + surgeryBeginDate + '\'' +
                ", surgeryEndDate='" + surgeryEndDate + '\'' +
                ", surgeryDrCode='" + surgeryDrCode + '\'' +
                ", surgeryDrName='" + surgeryDrName + '\'' +
                ", anesMethodCode='" + anesMethodCode + '\'' +
                ", anesMethodName='" + anesMethodName + '\'' +
                ", anesDrCode='" + anesDrCode + '\'' +
                ", anesDrName='" + anesDrName + '\'' +
                '}';
    }
}