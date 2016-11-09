package com.lanniuh.hospmedical.inhosprecord.dao;


import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.inhosprecord.InhospRecord;
import com.lanniuh.hospmedical.model.inhosprecord.InhospRecordReq;

import java.util.List;

public interface InhospRecordMapper {
    List<InhospRecord> selectByParamsUnpaged(InhospRecordReq inhospRecordReq);
    Page<InhospRecord> selectByParamsPaged(InhospRecordReq inhospRecordReq);
    int selectStatistics(InhospRecordReq inhospRecordReq);
}