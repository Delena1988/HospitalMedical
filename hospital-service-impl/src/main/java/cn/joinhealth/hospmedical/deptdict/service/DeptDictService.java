package cn.joinhealth.hospmedical.deptdict.service;


import cn.joinhealth.hospmedical.model.deptdict.DeptDict;
import cn.joinhealth.hospmedical.model.deptdict.DeptDictReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface DeptDictService {
    /**
     * @Description:根据科室代码查询可是信息
     * @param: deptDictReq
     * @return: List<DeptDict>
     */
    List<DeptDict> selectByDeptCode(DeptDictReq deptDictReq);

    /**
     * @Description:根据科室索引号查询科室信息
     * @param deptDictReq
     * @return DeptDict
     */
    DeptDict selectByDeptIndexNo(DeptDictReq deptDictReq);

    /**
     * @Description:查询所有科室信息
     * @param deptDictReq
     * @return List<DeptDict>
     */
    List<DeptDict> selectAll(DeptDictReq deptDictReq);
}
