package cn.joinhealth.hospmedical.inhosporder.service;

import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.inhosporder.InhospOrder;
import cn.joinhealth.hospmedical.model.inhosporder.InhospOrderReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospOrderService {
    /**
     * @Description:查询住院医嘱信息  分页
     * @param: [inhospOrderReq]
     * @return: com.github.pagehelper.Page<cn.joinhealth.hospmedical.model.inhosporder.InhospOrder>
     */
    Page<InhospOrder> selectByParams(InhospOrderReq inhospOrderReq);
}
