package cn.joinhealth.hospmedical.staffdict.dao;


import cn.joinhealth.hospmedical.model.staffdict.StaffDict;

import java.util.List;

public interface StaffDictMapper {
    List<StaffDict> selectAll();
}