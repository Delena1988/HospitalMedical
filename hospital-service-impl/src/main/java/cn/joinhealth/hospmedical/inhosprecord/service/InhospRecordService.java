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
    /**
     * @Description:查询住院记录信息 不分页
     * @param: [inhospRecordReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.inhosprecord.InhospRecord>
     */
    List<InhospRecord> selectByParamsUnpaged(InhospRecordReq inhospRecordReq);

    /**
     * @Description:查询住院记录信息 分页
     * @param: [inhospRecordReq]
     * @return: com.github.pagehelper.Page<cn.joinhealth.hospmedical.model.inhosprecord.InhospRecord>
     */
    Page<InhospRecord> selectByParamsPaged(InhospRecordReq inhospRecordReq);

    /**
     * @Description:查询住院人次，用于统计
     * @param: [inhospRecordReq]
     * @return: int
     */
    int selectStatistics(InhospRecordReq inhospRecordReq);
}
