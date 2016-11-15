package cn.joinhealth.appointment.model.remainingnosource;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 剩余号源
 */
public class RemainingNoSource implements Serializable {
    private static final long serialVersionUID = -2491549966857772760L;
    private String organCode;//组织机构代码
    private String schedulingNo;//排班编号
    private String amount;//可预约数量
    private String remainingAmount;//余号数量

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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount == null ? null : remainingAmount.trim();
    }

    @Override
    public String toString() {
        return "RemainingNoSource{" +
                "schedulingNo='" + schedulingNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", amount='" + amount + '\'' +
                ", remainingAmount='" + remainingAmount + '\'' +
                '}';
    }
}