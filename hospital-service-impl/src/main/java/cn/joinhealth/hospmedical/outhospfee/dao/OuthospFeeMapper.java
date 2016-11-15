package cn.joinhealth.hospmedical.outhospfee.dao;


import cn.joinhealth.hospmedical.model.outhospfee.OuthospFee;
import cn.joinhealth.hospmedical.model.outhospfee.OuthospFeeReq;

import java.util.List;

public interface OuthospFeeMapper {
    List<OuthospFee> selectByParams(OuthospFeeReq outhospFeeReq);
}