package cn.joinhealth.hospmedical.surgeryrecord.service;

import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecordReq;
import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecord;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SurgeryRecordService {
    /**
     * @Description:查询手术记录
     * @param: [surgeryRecordReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecord>
     */
    List<SurgeryRecord> selectByParams(SurgeryRecordReq surgeryRecordReq);
}
