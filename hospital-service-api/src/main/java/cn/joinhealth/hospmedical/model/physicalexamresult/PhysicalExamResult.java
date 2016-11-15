package cn.joinhealth.hospmedical.model.physicalexamresult;


import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 体检结果
 */
public class PhysicalExamResult implements Serializable {
    private static final long serialVersionUID = -7748285880299151663L;
    private String organCode;//组织机构代码
    private String reportNo;//体检报告号
    private String resultNo;//体检结果编号
    private String examDate;//检查日期
    private String deptCode;//科室代码
    private String deptName;//科室名称
    private String drCode;//检查医生工号
    private String drName;//检查医生姓名
    private String groupItemCode;//组合项目编号
    private String groupItemName;//组合项目名称
    private String groupItemTypeCode;//组合项目类型代码
    private String groupItemTypeName;//组合项目类型名称  1、检验 2、放射 3、超声 4、病理 9其他
    private String itemCode;//项目明细代码
    private String itemName;//项目明细名称
    private String itemResult;//项目明细结果
    private String normalFlag;//正常标志  有值表示异常，空值表示正常
    private String unit;//单位
    private String referenceRanges;//参考范围
    private String referenceUpperLimit;//参考上限
    private String referenceLowerLimit;//参考下限
    private String examSummary;//体检小结

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

    public String getResultNo() {
        return resultNo;
    }

    public void setResultNo(String resultNo) {
        this.resultNo = resultNo == null ? null : resultNo.trim();
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate == null ? null : examDate.trim();
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

    public String getGroupItemCode() {
        return groupItemCode;
    }

    public void setGroupItemCode(String groupItemCode) {
        this.groupItemCode = groupItemCode == null ? null : groupItemCode.trim();
    }

    public String getGroupItemName() {
        return groupItemName;
    }

    public void setGroupItemName(String groupItemName) {
        this.groupItemName = groupItemName == null ? null : groupItemName.trim();
    }

    public String getGroupItemTypeCode() {
        return groupItemTypeCode;
    }

    public void setGroupItemTypeCode(String groupItemTypeCode) {
        this.groupItemTypeCode = groupItemTypeCode == null ? null : groupItemTypeCode.trim();
    }

    public String getGroupItemTypeName() {
        return groupItemTypeName;
    }

    public void setGroupItemTypeName(String groupItemTypeName) {
        this.groupItemTypeName = groupItemTypeName == null ? null : groupItemTypeName.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemResult() {
        return itemResult;
    }

    public void setItemResult(String itemResult) {
        this.itemResult = itemResult == null ? null : itemResult.trim();
    }

    public String getNormalFlag() {
        return normalFlag;
    }

    public void setNormalFlag(String normalFlag) {
        this.normalFlag = normalFlag == null ? null : normalFlag.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
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

    public String getExamSummary() {
        return examSummary;
    }

    public void setExamSummary(String examSummary) {
        this.examSummary = examSummary == null ? null : examSummary.trim();
    }

    @Override
    public String toString() {
        return "PhysicalExamResult{" +
                "reportNo='" + reportNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", resultNo='" + resultNo + '\'' +
                ", examDate='" + examDate + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", drCode='" + drCode + '\'' +
                ", drName='" + drName + '\'' +
                ", groupItemCode='" + groupItemCode + '\'' +
                ", groupItemName='" + groupItemName + '\'' +
                ", groupItemTypeCode='" + groupItemTypeCode + '\'' +
                ", groupItemTypeName='" + groupItemTypeName + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemResult='" + itemResult + '\'' +
                ", normalFlag='" + normalFlag + '\'' +
                ", unit='" + unit + '\'' +
                ", referenceRanges='" + referenceRanges + '\'' +
                ", referenceUpperLimit='" + referenceUpperLimit + '\'' +
                ", referenceLowerLimit='" + referenceLowerLimit + '\'' +
                ", examSummary='" + examSummary + '\'' +
                '}';
    }
}