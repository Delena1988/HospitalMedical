package cn.joinhealth.hospmedical.cardnoinfo.dao;

import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo;
import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfoReq;

import java.util.List;


public interface CardNoInfoMapper {
    List<CardNoInfo> selectByPatIndexNo(CardNoInfoReq cardNoInfoReq);
    List<CardNoInfo> selectByIdNumberAndPatName(CardNoInfoReq cardNoInfoReq);
    List<CardNoInfo> selectByCardNoAndPatName(CardNoInfoReq cardNoInfoReq);
    List<CardNoInfo> selectByCardNoAndCardType(CardNoInfoReq cardNoInfoReq);
}