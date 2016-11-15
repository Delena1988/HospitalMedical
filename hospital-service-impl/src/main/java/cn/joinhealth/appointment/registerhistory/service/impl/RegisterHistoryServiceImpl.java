package cn.joinhealth.appointment.registerhistory.service.impl;

import cn.joinhealth.appointment.model.registerhistory.RegisterHistoryReq;
import cn.joinhealth.appointment.model.registerhistory.RegisterHistory;
import cn.joinhealth.appointment.registerhistory.dao.RegisterHistoryMapper;
import cn.joinhealth.appointment.registerhistory.service.RegisterHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "registerHistoryService")
public class RegisterHistoryServiceImpl implements RegisterHistoryService {
    @Autowired
    private RegisterHistoryMapper registerHistoryMapper;

    @Override
    public List<RegisterHistory> selectByParams(RegisterHistoryReq registerHistoryReq) {
        return registerHistoryMapper.selectByParams(registerHistoryReq);
    }
}
