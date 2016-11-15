package cn.joinhealth.hospmedical.cardnoinfo.service.impl;

import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfo;
import cn.joinhealth.hospmedical.cardnoinfo.dao.CardNoInfoMapper;
import cn.joinhealth.hospmedical.cardnoinfo.service.CardNoInfoService;
import cn.joinhealth.hospmedical.model.cardnoinfo.CardNoInfoReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "cardNoInfoService")
public class CardNoInfoServiceImpl implements CardNoInfoService {
    @Autowired
    private CardNoInfoMapper cardNoInfoMapper;

    @Override
    public List<CardNoInfo> selectByPatIndexNo(String patIndexNo) {
        return cardNoInfoMapper.selectByPatIndexNo(patIndexNo);
    }

    @Override
    public List<CardNoInfo> selectByIdNumberAndPatName(CardNoInfoReq cardNoInfoReq) {
        return cardNoInfoMapper.selectByIdNumberAndPatName(cardNoInfoReq);
    }

    @Override
    public List<CardNoInfo> selectByCardNoAndPatName(CardNoInfoReq cardNoInfoReq) {
        return cardNoInfoMapper.selectByCardNoAndPatName(cardNoInfoReq);
    }

    @Override
    public List<CardNoInfo> selectByCardNoAndCardType(CardNoInfoReq cardNoInfoReq) {
        return selectByCardNoAndCardType(cardNoInfoReq);
    }
}
