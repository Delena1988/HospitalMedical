package cn.joinhealth.hospmedical.model.orderdetailinfo;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 处方明细请求
 */
public class OrderDetailInfoReq implements Serializable{
    private static final long serialVersionUID = 8502160419797502247L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String presNo;//处方号
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

    public String getPresNo() {
        return presNo;
    }

    public void setPresNo(String presNo) {
        this.presNo = presNo;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "OrderDetailInfoReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", presNo='" + presNo + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}