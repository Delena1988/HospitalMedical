package cn.joinhealth.service;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;
import cn.joinhealth.wechat.api.WeChatService;

/**
 * Created by linjian
 * 16/11/21
 * 微信接口
 */
public class WeChatServiceImpl implements WeChatService {
    @Override
    public ReplyMsg sendQuestionnaire(RequestMsg requestMsg) {
        return null;
    }

    @Override
    public ReplyMsg sendReferralReminder(RequestMsg requestMsg) {
        return null;
    }
}
