package com.lanniuh.hospmedical.diagdict.service;


import com.lanniuh.hospmedical.model.diagdict.DiagDict;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface DiagDictService {
    List<DiagDict> selectAll();
}
