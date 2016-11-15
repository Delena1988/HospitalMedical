package cn.joinhealth.hospmedical.deptdict.dao;


import cn.joinhealth.hospmedical.model.deptdict.DeptDict;

import java.util.List;

public interface DeptDictMapper {
    List<DeptDict> selectByDeptCode(String deptCode);

    DeptDict selectByDeptIndexNo(String deptIndexNo);

    List<DeptDict> selectAll();
}