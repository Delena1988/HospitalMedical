package cn.joinhealth.hospmedical.model.signs;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 体征信息
 */
public class Signs implements Serializable {
    private static final long serialVersionUID = -7499392817309914798L;
    private String organCode;//组织机构代码
    private String resultNo;//体征结果编号
    private String patIndexNo;//患者索引号
    private String visitCardNo;//就诊卡号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospSerialNo;//住院流水号
    private String patTypeName;//病人类型  门诊、住院、其他
    private String patName;//患者姓名
    private String idNumber;//身份证号码
    private String age;//年龄
    private String birthDate;//出生日期
    private String sexCode;//性别代码
    private String sexName;//性别名称
    private String type;//体征类型  （脉搏、腰围、心率、呼吸、舒张压、体重、血压、BMI、血糖、收缩压、身高、体温）
    private String vaule;//数值
    private String unit;//单位
    private String normalFlag;//正常标志  0、异常 1、正常
    private String measureDate;//测量时间

    public String getResultNo() {
        return resultNo;
    }

    public void setResultNo(String resultNo) {
        this.resultNo = resultNo == null ? null : resultNo.trim();
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

    public String getVisitCardNo() {
        return visitCardNo;
    }

    public void setVisitCardNo(String visitCardNo) {
        this.visitCardNo = visitCardNo == null ? null : visitCardNo.trim();
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

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo == null ? null : inhospSerialNo.trim();
    }

    public String getPatTypeName() {
        return patTypeName;
    }

    public void setPatTypeName(String patTypeName) {
        this.patTypeName = patTypeName == null ? null : patTypeName.trim();
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName == null ? null : sexName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getVaule() {
        return vaule;
    }

    public void setVaule(String vaule) {
        this.vaule = vaule == null ? null : vaule.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getNormalFlag() {
        return normalFlag;
    }

    public void setNormalFlag(String normalFlag) {
        this.normalFlag = normalFlag == null ? null : normalFlag.trim();
    }

    public String getMeasureDate() {
        return measureDate;
    }

    public void setMeasureDate(String measureDate) {
        this.measureDate = measureDate == null ? null : measureDate.trim();
    }

    @Override
    public String toString() {
        return "Signs{" +
                "resultNo='" + resultNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", patTypeName='" + patTypeName + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", age='" + age + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", sexName='" + sexName + '\'' +
                ", type='" + type + '\'' +
                ", vaule='" + vaule + '\'' +
                ", unit='" + unit + '\'' +
                ", normalFlag='" + normalFlag + '\'' +
                ", measureDate='" + measureDate + '\'' +
                '}';
    }
}