package cn.joinhealth.appointment.model.physicalexampackagedetail;

import java.io.Serializable;

public class PhysicalExamPackageDetail implements Serializable {
    private static final long serialVersionUID = -1486295177810637813L;
    private String organCode;//组织机构代码
    private String packageNo;//套餐编号
    private String itemCode;//项目代码
    private String itemName;//项目名称
    private String itemType;//项目类型
    private String itemContent;//项目内容
    private String itemMeaning;//项目意义

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo == null ? null : packageNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent == null ? null : itemContent.trim();
    }

    public String getItemMeaning() {
        return itemMeaning;
    }

    public void setItemMeaning(String itemMeaning) {
        this.itemMeaning = itemMeaning == null ? null : itemMeaning.trim();
    }

    @Override
    public String toString() {
        return "PhysicalExamPackageDetail{" +
                "packageNo='" + packageNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemContent='" + itemContent + '\'' +
                ", itemMeaning='" + itemMeaning + '\'' +
                '}';
    }
}