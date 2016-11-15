package cn.joinhealth.hospmedical.deptdict.service;


import cn.joinhealth.hospmedical.model.deptdict.DeptDict;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface DeptDictService {
    /**
     * @Description:根据科室代码查询可是信息
     * @param: [deptCode] 科室代码
     * @return: java.util.List<cn.joinhealth.hospmedical.model.deptdict.DeptDict>
     */
    List<DeptDict> selectByDeptCode(String deptCode);

    /**
     * @Description:根据科室索引号查询科室信息
     * @param: [deptIndexNo]科室索引号
     * @return: cn.joinhealth.hospmedical.model.deptdict.DeptDict
     */
    DeptDict selectByDeptIndexNo(String deptIndexNo);

    /**
     * @Description:查询所有科室信息
     * @param: []
     * @return: java.util.List<cn.joinhealth.hospmedical.model.deptdict.DeptDict>
     */
    List<DeptDict> selectAll();
}
