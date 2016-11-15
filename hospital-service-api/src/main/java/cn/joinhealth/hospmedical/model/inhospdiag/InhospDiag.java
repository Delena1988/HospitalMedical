package cn.joinhealth.hospmedical.model.inhospdiag;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 住院诊断
 */
public class InhospDiag implements Serializable {
    private static final long serialVersionUID = 311412634854420448L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String inhospNo;//住院号
    private String inhospNum;//住院次数
    private String inhospSerialNo;//住院流水号
    private String diagIndexNo;//诊断索引号
    private String diagDate;//诊断日期
    private String diagNo;//诊断序号
    private String diagTypeCode;//诊断类型代码  1-主诊断，2-次诊断
    private String diagTypeName;//诊断类型名称
    private String diagCode;//诊断代码
    private String diagName;//诊断名称
    private String diagIntroduction;//诊断说明

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo == null ? null : inhospSerialNo.trim();
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

    public String getDiagIndexNo() {
        return diagIndexNo;
    }

    public void setDiagIndexNo(String diagIndexNo) {
        this.diagIndexNo = diagIndexNo == null ? null : diagIndexNo.trim();
    }

    public String getDiagDate() {
        return diagDate;
    }

    public void setDiagDate(String diagDate) {
        this.diagDate = diagDate == null ? null : diagDate.trim();
    }

    public String getDiagNo() {
        return diagNo;
    }

    public void setDiagNo(String diagNo) {
        this.diagNo = diagNo == null ? null : diagNo.trim();
    }

    public String getDiagTypeCode() {
        return diagTypeCode;
    }

    public void setDiagTypeCode(String diagTypeCode) {
        this.diagTypeCode = diagTypeCode == null ? null : diagTypeCode.trim();
    }

    public String getDiagTypeName() {
        return diagTypeName;
    }

    public void setDiagTypeName(String diagTypeName) {
        this.diagTypeName = diagTypeName == null ? null : diagTypeName.trim();
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode == null ? null : diagCode.trim();
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName == null ? null : diagName.trim();
    }

    public String getDiagIntroduction() {
        return diagIntroduction;
    }

    public void setDiagIntroduction(String diagIntroduction) {
        this.diagIntroduction = diagIntroduction == null ? null : diagIntroduction.trim();
    }

    @Override
    public String toString() {
        return "InhospDiag{" +
                "inhospSerialNo='" + inhospSerialNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospNum='" + inhospNum + '\'' +
                ", diagIndexNo='" + diagIndexNo + '\'' +
                ", diagDate='" + diagDate + '\'' +
                ", diagNo='" + diagNo + '\'' +
                ", diagTypeCode='" + diagTypeCode + '\'' +
                ", diagTypeName='" + diagTypeName + '\'' +
                ", diagCode='" + diagCode + '\'' +
                ", diagName='" + diagName + '\'' +
                ", diagIntroduction='" + diagIntroduction + '\'' +
                '}';
    }
}