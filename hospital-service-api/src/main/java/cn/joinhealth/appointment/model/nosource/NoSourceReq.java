package cn.joinhealth.appointment.model.nosource;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 号源信息请求
 */
public class NoSourceReq implements Serializable{
    private static final long serialVersionUID = 6382195149623297740L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String schedulingNo;//排班编号
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

    public String getSchedulingNo() {
        return schedulingNo;
    }

    public void setSchedulingNo(String schedulingNo) {
        this.schedulingNo = schedulingNo;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "NoSourceReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", schedulingNo='" + schedulingNo + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}