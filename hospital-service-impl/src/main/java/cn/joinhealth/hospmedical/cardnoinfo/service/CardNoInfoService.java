package cn.joinhealth.hospmedical.cardnoinfo.service;

import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo;
import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface CardNoInfoService {
    List<CardNoInfo> selectByPatIndexNo(String patIndexNo);
    List<CardNoInfo> selectByIdNumberAndPatName(CardNoInfoReq cardNoInfoReq);
    List<CardNoInfo> selectByCardNoAndPatName(CardNoInfoReq cardNoInfoReq);
    List<CardNoInfo> selectByCardNoAndCardType(CardNoInfoReq cardNoInfoReq);
}
