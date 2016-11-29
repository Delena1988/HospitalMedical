package cn.joinhealth.hospmedical.deptdict.dao;


import cn.joinhealth.hospmedical.model.deptdict.DeptDict;
import cn.joinhealth.hospmedical.model.deptdict.DeptDictReq;

import java.util.List;

public interface DeptDictMapper {
    List<DeptDict> selectByDeptCode(DeptDictReq deptDictReq);

    DeptDict selectByDeptIndexNo(DeptDictReq deptDictReq);

    List<DeptDict> selectAll(DeptDictReq deptDictReq);
}