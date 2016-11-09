package com.lanniuh.hospmedical.inhosprecord.service;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.inhosprecord.InhospRecord;
import com.lanniuh.hospmedical.model.inhosprecord.InhospRecordReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/2.
 */
public interface InhospRecordService {
    List<InhospRecord> selectByParamsUnpaged(InhospRecordReq inhospRecordReq);
    Page<InhospRecord> selectByParamsPaged(InhospRecordReq inhospRecordReq);
    int selectStatistics(InhospRecordReq inhospRecordReq);
}
