package cn.joinhealth.hospmedical.model.inhospfee;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 住院费用请求
 */
public class InhospFeeReq implements Serializable {
    private static final long serialVersionUID = -1613798789522000690L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String inhospSerialNo;//住院流水号
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

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "InhospFeeReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}