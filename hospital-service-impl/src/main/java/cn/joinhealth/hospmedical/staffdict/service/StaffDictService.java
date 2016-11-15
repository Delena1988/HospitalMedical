package cn.joinhealth.hospmedical.staffdict.service;


import cn.joinhealth.hospmedical.model.staffdict.StaffDict;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface StaffDictService {
    List<StaffDict> selectAll();
}
