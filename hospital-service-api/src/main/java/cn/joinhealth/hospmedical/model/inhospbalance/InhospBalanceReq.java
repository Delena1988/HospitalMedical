package cn.joinhealth.hospmedical.model.inhospbalance;

import java.io.Serializable;
import java.util.List;

/**
 * Created by linjian
 * 16/11/15
 * 住院费用结算请求
 */
public class InhospBalanceReq implements Serializable {
    private static final long serialVersionUID = -7261004249185420554L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private List<String> dealNo;//交易流水号

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

    public List<String> getDealNo() {
        return dealNo;
    }

    public void setDealNo(List<String> dealNo) {
        this.dealNo = dealNo;
    }

    @Override
    public String toString() {
        return "InhospBalanceReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", dealNo=" + dealNo +
                '}';
    }
}