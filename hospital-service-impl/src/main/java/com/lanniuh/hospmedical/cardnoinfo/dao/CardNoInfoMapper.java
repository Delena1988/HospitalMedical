package com.lanniuh.hospmedical.cardnoinfo.dao;

import com.lanniuh.hospmedical.model.cardnoinfo.CardNoInfo;
import com.lanniuh.hospmedical.model.cardnoinfo.CardNoInfoReq;

import java.util.List;


public interface CardNoInfoMapper {
    List<CardNoInfo> selectByPatIndexNo(String patIndexNo);
    List<CardNoInfo> selectByIdNumberAndPatName(CardNoInfoReq cardNoInfoReq);
    List<CardNoInfo> selectByCardNoAndPatName(CardNoInfoReq cardNoInfoReq);
    List<CardNoInfo> selectByCardNoAndCardType(CardNoInfoReq cardNoInfoReq);
}