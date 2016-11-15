package cn.joinhealth.appointment.model.physicalexampackage;

import java.io.Serializable;

public class PhysicalExamPackageReq implements Serializable{
    private static final long serialVersionUID = -18644458244397739L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String packageNo;//套餐编号

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

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    @Override
    public String toString() {
        return "PhysicalExamPackageReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", packageNo='" + packageNo + '\'' +
                '}';
    }
}