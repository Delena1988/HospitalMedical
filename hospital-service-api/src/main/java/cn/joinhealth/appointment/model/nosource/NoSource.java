package cn.joinhealth.appointment.model.nosource;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 号源信息
 */
public class NoSource implements Serializable {
    private static final long serialVersionUID = 1120195783116487009L;
    private String schedulingNo;//排班编号
    private String organCode;//组织机构代码
    private String visitDate;//日期 yyyy-mm-dd
    private String ap;//班次
    private String seqNo;//号源序号
    private String visitTime;//就诊时间 hh:mi:ss
    private String status;//号源状态

    public String getSchedulingNo() {
        return schedulingNo;
    }

    public void setSchedulingNo(String schedulingNo) {
        this.schedulingNo = schedulingNo == null ? null : schedulingNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate == null ? null : visitDate.trim();
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap == null ? null : ap.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime == null ? null : visitTime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        return "NoSource{" +
                "schedulingNo='" + schedulingNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", ap='" + ap + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", visitTime='" + visitTime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}