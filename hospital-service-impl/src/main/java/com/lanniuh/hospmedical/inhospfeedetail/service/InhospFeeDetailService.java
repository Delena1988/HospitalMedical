package com.lanniuh.hospmedical.inhospfeedetail.service;

import com.lanniuh.hospmedical.model.inhospfeedetail.InhospFeeDetail;
import com.lanniuh.hospmedical.model.inhospfeedetail.InhospFeeDetailReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospFeeDetailService {
    List<InhospFeeDetail> selectByParams(InhospFeeDetailReq inhospFeeDetailReq);
}
