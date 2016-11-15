package cn.joinhealth.hospmedical.signs.service.impl;

import cn.joinhealth.hospmedical.signs.service.SignsService;
import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.signs.Signs;
import cn.joinhealth.hospmedical.model.signs.SignsReq;
import cn.joinhealth.hospmedical.signs.dao.SignsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "SignsService")
public class SignsServiceImpl implements SignsService {
    @Autowired
    private SignsMapper signsMapper;

    @Override
    public List<Signs> selectByParamsUnpaged(SignsReq signsReq) {
        return signsMapper.selectByParamsUnpaged(signsReq);
    }

    @Override
    public Page<Signs> selectByParamsPaged(SignsReq signsReq) {
        return signsMapper.selectByParamsPaged(signsReq);
    }
}
