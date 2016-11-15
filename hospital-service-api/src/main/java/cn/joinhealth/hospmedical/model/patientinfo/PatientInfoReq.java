package cn.joinhealth.hospmedical.model.patientinfo;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 患者基本信息请求
 */
public class PatientInfoReq implements Serializable{
    private static final long serialVersionUID = -1511938743268998451L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String patName;//患者姓名
    private String idNumber;//身份证号码
    private String mobileNo;//手机号

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
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

    @Override
    public String toString() {
        return "PatientInfoReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}