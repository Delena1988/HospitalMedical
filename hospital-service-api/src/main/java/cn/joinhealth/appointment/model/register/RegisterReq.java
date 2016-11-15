package cn.joinhealth.appointment.model.register;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 预约挂号请求
 */
public class RegisterReq implements Serializable {
    private static final long serialVersionUID = 8513843757771329572L;
    private String organCode;//组织机构代码
    private String schedulingNo;//排班编号
    private String visitDate;//日期
    private String ap;//班次 A-上午 P-下午
    private String seqNo;//号源序号
    private String patId;//患者id
    private String patName;//姓名
    private String sexCode;//性别代码
    private String sexName;//性别名称
    private String idNumber;//身份证
    private String mobileNo;//手机号
    private String visitCardType;//就诊卡类型
    private String visitCardNo;//就诊卡号
    private String password;//取号密码

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getSchedulingNo() {
        return schedulingNo;
    }

    public void setSchedulingNo(String schedulingNo) {
        this.schedulingNo = schedulingNo;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getVisitCardType() {
        return visitCardType;
    }

    public void setVisitCardType(String visitCardType) {
        this.visitCardType = visitCardType;
    }

    public String getVisitCardNo() {
        return visitCardNo;
    }

    public void setVisitCardNo(String visitCardNo) {
        this.visitCardNo = visitCardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegisterReq{" +
                "organCode='" + organCode + '\'' +
                ", schedulingNo='" + schedulingNo + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", ap='" + ap + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", patId='" + patId + '\'' +
                ", patName='" + patName + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", sexName='" + sexName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", visitCardType='" + visitCardType + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}