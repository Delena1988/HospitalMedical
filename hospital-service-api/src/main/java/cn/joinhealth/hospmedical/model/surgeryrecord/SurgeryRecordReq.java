package cn.joinhealth.hospmedical.model.surgeryrecord;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 手术记录请求
 */
public class SurgeryRecordReq implements Serializable{
    private static final long serialVersionUID = 398869078844944029L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String outhospSerialNo;// 门诊流水号
    private String inhospSerialNo;// 住院流水号
    private String admitDate;//入院时间
    private String dischargeDate;//出院时间
    private String inhospNo;//住院号

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

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo;
    }

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getInhospNo() {
        return inhospNo;
    }

    public void setInhospNo(String inhospNo) {
        this.inhospNo = inhospNo;
    }

    @Override
    public String toString() {
        return "SurgeryRecordReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", admitDate='" + admitDate + '\'' +
                ", dischargeDate='" + dischargeDate + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                '}';
    }
}