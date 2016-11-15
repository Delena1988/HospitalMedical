package cn.joinhealth.hospmedical.signs.dao;


import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.signs.Signs;
import cn.joinhealth.hospmedical.model.signs.SignsReq;

import java.util.List;

public interface SignsMapper {
    List<Signs> selectByParamsUnpaged(SignsReq signsReq);
    Page<Signs> selectByParamsPaged(SignsReq signsReq);
}