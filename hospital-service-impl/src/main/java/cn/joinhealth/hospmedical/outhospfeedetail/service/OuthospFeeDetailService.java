package cn.joinhealth.hospmedical.outhospfeedetail.service;

import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetail;
import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospFeeDetailService {
    List<OuthospFeeDetail> selectByParams(OuthospFeeDetailReq outhospFeeDetailReq);
}
