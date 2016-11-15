package cn.joinhealth.hospmedical.model.testresult;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 检验结果
 */
public class TestResult implements Serializable {
    private static final long serialVersionUID = -1102118939690783717L;
    private String organCode;//组织机构代码
    private String reportNo;//报告单编号
    private String testResultNo;//检验结果编号
    private String testItemCode;//检验项目代码
    private String testItemName;//检验项目名称
    private String testResultValue;//检验结果值
    private String testResultValueUnit;//检验结果值单位
    private String referenceRanges;//参考范围
    private String referenceUpperLimit;//参考上限
    private String referenceLowerLimit;//参考下限
    private String normalFlag;//正常标志  有值表示异常，空值表示正常

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

    public String getTestItemCode() {
        return testItemCode;
    }

    public void setTestItemCode(String testItemCode) {
        this.testItemCode = testItemCode == null ? null : testItemCode.trim();
    }

    public String getTestItemName() {
        return testItemName;
    }

    public void setTestItemName(String testItemName) {
        this.testItemName = testItemName == null ? null : testItemName.trim();
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

    public String getNormalFlag() {
        return normalFlag;
    }

    public void setNormalFlag(String normalFlag) {
        this.normalFlag = normalFlag == null ? null : normalFlag.trim();
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "reportNo='" + reportNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", testResultNo='" + testResultNo + '\'' +
                ", testItemCode='" + testItemCode + '\'' +
                ", testItemName='" + testItemName + '\'' +
                ", testResultValue='" + testResultValue + '\'' +
                ", testResultValueUnit='" + testResultValueUnit + '\'' +
                ", referenceRanges='" + referenceRanges + '\'' +
                ", referenceUpperLimit='" + referenceUpperLimit + '\'' +
                ", referenceLowerLimit='" + referenceLowerLimit + '\'' +
                ", normalFlag='" + normalFlag + '\'' +
                '}';
    }
}