package cn.joinhealth.hospmedical.physicalexamresult.service;

import cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResult;
import cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResultReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamResultService {
    /**
     * @Description:查询体检报告结果
     * @param: [physicalExamResultReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResult>
     */
    List<PhysicalExamResult> selectByParams(PhysicalExamResultReq physicalExamResultReq);
}
