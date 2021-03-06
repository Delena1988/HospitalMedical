package cn.joinhealth.appointment.model.cancelregister;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 取消预约请求
 */
public class CancelRegisterReq implements Serializable {
    private static final long serialVersionUID = -6409647969130021095L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String schedulingNo;//排班编号
    private String visitDate;//日期
    private String ap;//班次
    private String seqNo;//号源序号
    private String patName;//患者姓名
    private String idNumber;//身份证
    private String password;//取号密码
    private String registerRecordNo;//预约记录序号
    private int dataSourceType;//数据源类型 1、oracle 2、sqlserver 3、mysql

    public int getSysCode() {
        return sysCode;
    }

    public void setSysCode(int sysCode) {
        this.sysCode = sysCode;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterRecordNo() {
        return registerRecordNo;
    }

    public void setRegisterRecordNo(String registerRecordNo) {
        this.registerRecordNo = registerRecordNo;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "CancelRegisterReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", schedulingNo='" + schedulingNo + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", ap='" + ap + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", patName='" + patName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", password='" + password + '\'' +
                ", registerRecordNo='" + registerRecordNo + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}