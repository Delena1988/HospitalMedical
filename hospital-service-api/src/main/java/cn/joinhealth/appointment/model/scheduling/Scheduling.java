package cn.joinhealth.appointment.model.scheduling;

import java.io.Serializable;

public class Scheduling implements Serializable {
    private static final long serialVersionUID = -5056744307069191925L;
    private String organCode;//组织机构代码
    private String schedulingNo;//排班编号
    private String superiorDeptCode;//上级科室代码
    private String superiorDeptName;//上级科室名称
    private String deptCode;//科室代码
    private String deptName;//科室名称
    private String drCode;//医生工号
    private String drName;//医生姓名
    private String title;//职称
    private String type;//挂号类别
    private String visitDate;//日期
    private String ap;//班次
    private String fee;//挂号费
    private String amount;//可预约数量
    private String registerAmount;//可挂号数量
    private String status;//状态

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

    public String getSuperiorDeptCode() {
        return superiorDeptCode;
    }

    public void setSuperiorDeptCode(String superiorDeptCode) {
        this.superiorDeptCode = superiorDeptCode == null ? null : superiorDeptCode.trim();
    }

    public String getSuperiorDeptName() {
        return superiorDeptName;
    }

    public void setSuperiorDeptName(String superiorDeptName) {
        this.superiorDeptName = superiorDeptName == null ? null : superiorDeptName.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDrCode() {
        return drCode;
    }

    public void setDrCode(String drCode) {
        this.drCode = drCode == null ? null : drCode.trim();
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName == null ? null : drName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getRegisterAmount() {
        return registerAmount;
    }

    public void setRegisterAmount(String registerAmount) {
        this.registerAmount = registerAmount == null ? null : registerAmount.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        return "Scheduling{" +
                "schedulingNo='" + schedulingNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", superiorDeptCode='" + superiorDeptCode + '\'' +
                ", superiorDeptName='" + superiorDeptName + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", drCode='" + drCode + '\'' +
                ", drName='" + drName + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", ap='" + ap + '\'' +
                ", fee='" + fee + '\'' +
                ", amount='" + amount + '\'' +
                ", registerAmount='" + registerAmount + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}