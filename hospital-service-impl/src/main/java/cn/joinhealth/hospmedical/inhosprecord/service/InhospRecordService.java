package cn.joinhealth.hospmedical.inhosprecord.service;

import cn.joinhealth.hospmedical.model.inhosprecord.InhospRecord;
import cn.joinhealth.hospmedical.model.inhosprecord.InhospRecordReq;
import com.github.pagehelper.Page;

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
