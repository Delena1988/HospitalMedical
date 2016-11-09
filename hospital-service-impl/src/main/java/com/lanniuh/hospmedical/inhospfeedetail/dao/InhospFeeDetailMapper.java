package com.lanniuh.hospmedical.inhospfeedetail.dao;


import com.lanniuh.hospmedical.model.inhospfeedetail.InhospFeeDetail;
import com.lanniuh.hospmedical.model.inhospfeedetail.InhospFeeDetailReq;

import java.util.List;

public interface InhospFeeDetailMapper {
    List<InhospFeeDetail> selectByParams(InhospFeeDetailReq inhospFeeDetailReq);
}