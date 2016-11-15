package cn.joinhealth.hospmedical.model.microbetestresult;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 微生物检验结果
 */
public class MicrobeTestResult implements Serializable {
    private static final long serialVersionUID = -1469318032273348114L;
    private String organCode;//组织机构代码
    private String reportNo;//报告单编号
    private String testResultNo;//检验结果编号
    private String microbeName;//微生物名称
    private String bacterialColonyCount;//菌落计数
    private String antibiotics;//抗生素名称
    private String testResultValue;//检验结果值
    private String testResultValueUnit;//检验结果值单位
    private String testQualitativeResult;//检验定性结果
    private String testMethod;//检验方法
    private String referenceRanges;//参考范围
    private String referenceUpperLimit;//参考上限
    private String referenceLowerLimit;//参考下限
    private String note;//备注

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getTestResultNo() {
        return testResultNo;
    }

    public void setTestResultNo(String testResultNo) {
        this.testResultNo = testResultNo == null ? null : testResultNo.trim();
    }

    public String getMicrobeName() {
        return microbeName;
    }

    public void setMicrobeName(String microbeName) {
        this.microbeName = microbeName == null ? null : microbeName.trim();
    }

    public String getBacterialColonyCount() {
        return bacterialColonyCount;
    }

    public void setBacterialColonyCount(String bacterialColonyCount) {
        this.bacterialColonyCount = bacterialColonyCount == null ? null : bacterialColonyCount.trim();
    }

    public String getAntibiotics() {
        return antibiotics;
    }

    public void setAntibiotics(String antibiotics) {
        this.antibiotics = antibiotics == null ? null : antibiotics.trim();
    }

    public String getTestResultValue() {
        return testResultValue;
    }

    public void setTestResultValue(String testResultValue) {
        this.testResultValue = testResultValue == null ? null : testResultValue.trim();
    }

    public String getTestResultValueUnit() {
        return testResultValueUnit;
    }

    public void setTestResultValueUnit(String testResultValueUnit) {
        this.testResultValueUnit = testResultValueUnit == null ? null : testResultValueUnit.trim();
    }

    public String getTestQualitativeResult() {
        return testQualitativeResult;
    }

    public void setTestQualitativeResult(String testQualitativeResult) {
        this.testQualitativeResult = testQualitativeResult == null ? null : testQualitativeResult.trim();
    }

    public String getTestMethod() {
        return testMethod;
    }

    public void setTestMethod(String testMethod) {
        this.testMethod = testMethod == null ? null : testMethod.trim();
    }

    public String getReferenceRanges() {
        return referenceRanges;
    }

    public void setReferenceRanges(String referenceRanges) {
        this.referenceRanges = referenceRanges == null ? null : referenceRanges.trim();
    }

    public String getReferenceUpperLimit() {
        return referenceUpperLimit;
    }

    public void setReferenceUpperLimit(String referenceUpperLimit) {
        this.referenceUpperLimit = referenceUpperLimit == null ? null : referenceUpperLimit.trim();
    }

    public String getReferenceLowerLimit() {
        return referenceLowerLimit;
    }

    public void setReferenceLowerLimit(String referenceLowerLimit) {
        this.referenceLowerLimit = referenceLowerLimit == null ? null : referenceLowerLimit.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "MicrobeTestResult{" +
                "reportNo='" + reportNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", testResultNo='" + testResultNo + '\'' +
                ", microbeName='" + microbeName + '\'' +
                ", bacterialColonyCount='" + bacterialColonyCount + '\'' +
                ", antibiotics='" + antibiotics + '\'' +
                ", testResultValue='" + testResultValue + '\'' +
                ", testResultValueUnit='" + testResultValueUnit + '\'' +
                ", testQualitativeResult='" + testQualitativeResult + '\'' +
                ", testMethod='" + testMethod + '\'' +
                ", referenceRanges='" + referenceRanges + '\'' +
                ", referenceUpperLimit='" + referenceUpperLimit + '\'' +
                ", referenceLowerLimit='" + referenceLowerLimit + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}