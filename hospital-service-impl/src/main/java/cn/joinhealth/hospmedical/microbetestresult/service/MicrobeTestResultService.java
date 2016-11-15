package cn.joinhealth.hospmedical.microbetestresult.service;

import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResult;
import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResultReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface MicrobeTestResultService {
    /**
     * @Description:查询微生物检验结果
     * @param: [microbeTestResultReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResult>
     */
    List<MicrobeTestResult> selectByParams(MicrobeTestResultReq microbeTestResultReq);
}
