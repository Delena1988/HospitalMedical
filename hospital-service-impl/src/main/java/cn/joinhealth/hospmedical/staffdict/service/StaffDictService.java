package cn.joinhealth.hospmedical.staffdict.service;


import cn.joinhealth.hospmedical.model.staffdict.StaffDict;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface StaffDictService {
    /**
     * @Description:查询所有职工信息
     * @param: []
     * @return: java.util.List<cn.joinhealth.hospmedical.model.staffdict.StaffDict>
     */
    List<StaffDict> selectAll();
}
