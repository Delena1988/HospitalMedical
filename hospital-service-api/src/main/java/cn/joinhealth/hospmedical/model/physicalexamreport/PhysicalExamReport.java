package cn.joinhealth.hospmedical.model.physicalexamreport;

import java.io.Serializable;

public class PhysicalExamReport implements Serializable {
    private static final long serialVersionUID = -4742271462499529292L;
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String visitCardNo;//就诊卡号
    private String reportNo;//体检报告号
    private String patName;//患者姓名
    private String idNumber;//身份证号码
    private String birthDate;//出生日期
    private String sexCode;//性别代码
    private String sexName;//性别名称
    private String maritalStatusCode;//婚姻状态代码
    private String maritalStatusName;//婚姻状态名称
    private String company;//工作单位
    private String familyAddr;//家庭住址
    private String mobileNo;//联系电话
    private String examDate;//体检日期
    private String examResult;//总检结果
    private String examAdvice;//总检建议
    private String reportDr;//报告医生
    private String reportDate;//报告日期
    private String checkDr;//审核医生
    private String checkDate;//审核时间
    private String examType;//体检类别  1-个人、2-团体
    private String age;//年龄

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

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode == null ? null : maritalStatusCode.trim();
    }

    public String getMaritalStatusName() {
        return maritalStatusName;
    }

    public void setMaritalStatusName(String maritalStatusName) {
        this.maritalStatusName = maritalStatusName == null ? null : maritalStatusName.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getFamilyAddr() {
        return familyAddr;
    }

    public void setFamilyAddr(String familyAddr) {
        this.familyAddr = familyAddr == null ? null : familyAddr.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate == null ? null : examDate.trim();
    }

    public String getExamResult() {
        return examResult;
    }

    public void setExamResult(String examResult) {
        this.examResult = examResult == null ? null : examResult.trim();
    }

    public String getExamAdvice() {
        return examAdvice;
    }

    public void setExamAdvice(String examAdvice) {
        this.examAdvice = examAdvice == null ? null : examAdvice.trim();
    }

    public String getReportDr() {
        return reportDr;
    }

    public void setReportDr(String reportDr) {
        this.reportDr = reportDr == null ? null : reportDr.trim();
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public String getCheckDr() {
        return checkDr;
    }

    public void setCheckDr(String checkDr) {
        this.checkDr = checkDr == null ? null : checkDr.trim();
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType == null ? null : examType.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    @Override
    public String toString() {
        return "PhysicalExamReport{" +
                "reportNo='" + reportNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", sexName='" + sexName + '\'' +
                ", maritalStatusCode='" + maritalStatusCode + '\'' +
                ", maritalStatusName='" + maritalStatusName + '\'' +
                ", company='" + company + '\'' +
                ", familyAddr='" + familyAddr + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", examDate='" + examDate + '\'' +
                ", examResult='" + examResult + '\'' +
                ", examAdvice='" + examAdvice + '\'' +
                ", reportDr='" + reportDr + '\'' +
                ", reportDate='" + reportDate + '\'' +
                ", checkDr='" + checkDr + '\'' +
                ", checkDate='" + checkDate + '\'' +
                ", examType='" + examType + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}