package cn.joinhealth.hospmedical.model.orderdetailinfo;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 处方明细请求
 */
public class OrderDetailInfoReq implements Serializable{
    private static final long serialVersionUID = 8502160419797502247L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String presNo;//处方号

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

    public String getPresNo() {
        return presNo;
    }

    public void setPresNo(String presNo) {
        this.presNo = presNo;
    }

    @Override
    public String toString() {
        return "OrderDetailInfoReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", presNo='" + presNo + '\'' +
                '}';
    }
}