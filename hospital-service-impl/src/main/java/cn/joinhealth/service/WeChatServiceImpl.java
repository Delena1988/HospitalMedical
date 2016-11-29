package cn.joinhealth.service;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;
import cn.joinhealth.wechat.api.WeChatService;
import cn.joinhealth.wechat.model.Questionnaire;
import cn.joinhealth.wechat.model.ReferralReminder;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;

/**
 * Created by linjian
 * 16/11/21
 * 微信接口
 */
public class WeChatServiceImpl implements WeChatService {
    @Override
    public ReplyMsg sendQuestionnaire(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(WeChatService.class);
        ReplyMsg replyMsg = new ReplyMsg();
        Questionnaire questionnaire = JSON.parseObject(requestMsg.getBody(), Questionnaire.class);
        reqLogger.info("sendQuestionnaire req: " + JSON.toJSONString(questionnaire));
        try {
            //TODO sendQuestionnaire
        } catch (Exception e) {
            replyMsg.setBody(e.getMessage());
            errorLogger.error("sendQuestionnaire exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public ReplyMsg sendReferralReminder(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(WeChatService.class);
        ReplyMsg replyMsg = new ReplyMsg();
        ReferralReminder referralReminder = JSON.parseObject(requestMsg.getBody(), ReferralReminder.class);
        reqLogger.info("sendReferralReminder req: " + JSON.toJSONString(referralReminder));
        try {
            //TODO sendReferralReminder
        } catch (Exception e) {
            replyMsg.setBody(e.getMessage());
            errorLogger.error("sendReferralReminder exception: " + e.getMessage());
        }
        return null;
    }
}
