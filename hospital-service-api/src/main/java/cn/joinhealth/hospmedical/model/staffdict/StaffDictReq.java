package cn.joinhealth.hospmedical.model.staffdict;

import java.io.Serializable;

public class StaffDictReq implements Serializable {
    private static final long serialVersionUID = 6550207402428606839L;
    private String sysCode;//1-hug 2-interview
    private String staffIndexNo;//组织机构代码
    private String organCode;//职工索引号
    private String staffCode;//职工工号
    private String staffName;//职工姓名

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getStaffIndexNo() {
        return staffIndexNo;
    }

    public void setStaffIndexNo(String staffIndexNo) {
        this.staffIndexNo = staffIndexNo;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Override
    public String toString() {
        return "StaffDictReq{" +
                "sysCode='" + sysCode + '\'' +
                ", staffIndexNo='" + staffIndexNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", staffCode='" + staffCode + '\'' +
                ", staffName='" + staffName + '\'' +
                '}';
    }
}