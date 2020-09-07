package com.gome.service;

import com.gome.pojo.QaQuestionReply;
import com.gome.util.ResultUtil;

import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/7 21:25
 * @Modified By:
 */
public interface QaQuestionReplyService {
    ResultUtil insertQaQuestionReply(List<QaQuestionReply> questionReplies);
}
