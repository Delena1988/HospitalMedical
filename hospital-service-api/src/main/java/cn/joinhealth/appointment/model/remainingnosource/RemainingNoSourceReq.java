package cn.joinhealth.appointment.model.remainingnosource;

import java.io.Serializable;

public class RemainingNoSourceReq implements Serializable{
    private static final long serialVersionUID = -7918283404804595202L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String schedulingNo;//排班编号

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

    public String getSchedulingNo() {
        return schedulingNo;
    }

    public void setSchedulingNo(String schedulingNo) {
        this.schedulingNo = schedulingNo;
    }

    @Override
    public String toString() {
        return "RemainingNoSourceReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", schedulingNo='" + schedulingNo + '\'' +
                '}';
    }
}