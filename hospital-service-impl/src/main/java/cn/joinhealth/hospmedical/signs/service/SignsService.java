package cn.joinhealth.hospmedical.signs.service;

import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.signs.Signs;
import cn.joinhealth.hospmedical.model.signs.SignsReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SignsService {
    /**
     * @Description:查询体征信息  不分页
     * @param: [signsReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.signs.Signs>
     */
    List<Signs> selectByParamsUnpaged(SignsReq signsReq);

    /**
     * @Description:查询体征信息 分页
     * @param: [signsReq]
     * @return: com.github.pagehelper.Page<cn.joinhealth.hospmedical.model.signs.Signs>
     */
    Page<Signs> selectByParamsPaged(SignsReq signsReq);
}
