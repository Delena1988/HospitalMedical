package cn.joinhealth.hospmedical.model.physicalexamresult;

import java.io.Serializable;

public class PhysicalExamResultReq implements Serializable{
    private static final long serialVersionUID = -3801135180958313828L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String reportNo;//体检报告号

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

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }

    @Override
    public String toString() {
        return "PhysicalExamResultReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", reportNo='" + reportNo + '\'' +
                '}';
    }
}