package cn.joinhealth.hospmedical.cardnoinfo.service;

import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo;
import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface CardNoInfoService {
    /**
     * @Description:根据患者索引号查询卡号信息
     * @param: [patIndexNo] 患者索引号
     * @return: java.util.List<cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo>
     */
    List<CardNoInfo> selectByPatIndexNo(String patIndexNo);

    /**
     * @Description:根据姓名、身份证查询卡号信息
     * @param: [cardNoInfoReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo>
     */
    List<CardNoInfo> selectByIdNumberAndPatName(CardNoInfoReq cardNoInfoReq);

    /**
     * @Description:根据姓名、卡号查询卡号信息
     * @param: [cardNoInfoReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo>
     */
    List<CardNoInfo> selectByCardNoAndPatName(CardNoInfoReq cardNoInfoReq);

    /**
     * @Description:根据卡号、卡类型查询卡号信息
     * @param: [cardNoInfoReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo>
     */
    List<CardNoInfo> selectByCardNoAndCardType(CardNoInfoReq cardNoInfoReq);
}
