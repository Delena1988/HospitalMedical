package com.lanniuh.hospmedical.signs.service;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.signs.Signs;
import com.lanniuh.hospmedical.model.signs.SignsReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SignsService {
    List<Signs> selectByParamsUnpaged(SignsReq signsReq);
    Page<Signs> selectByParamsPaged(SignsReq signsReq);
}
