package cn.joinhealth.hospmedical.outhospfeedetail.dao;


import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetail;
import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;

import java.util.List;

public interface OuthospFeeDetailMapper {
    List<OuthospFeeDetail> selectByParams(OuthospFeeDetailReq outhospFeeDetailReq);
}