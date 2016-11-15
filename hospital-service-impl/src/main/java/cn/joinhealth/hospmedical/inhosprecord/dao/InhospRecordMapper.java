package cn.joinhealth.hospmedical.inhosprecord.dao;


import cn.joinhealth.hospmedical.model.inhosprecord.InhospRecord;
import cn.joinhealth.hospmedical.model.inhosprecord.InhospRecordReq;
import com.github.pagehelper.Page;

import java.util.List;

public interface InhospRecordMapper {
    List<InhospRecord> selectByParamsUnpaged(InhospRecordReq inhospRecordReq);
    Page<InhospRecord> selectByParamsPaged(InhospRecordReq inhospRecordReq);
    int selectStatistics(InhospRecordReq inhospRecordReq);
}