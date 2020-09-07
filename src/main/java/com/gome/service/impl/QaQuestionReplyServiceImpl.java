package com.gome.service.impl;

import com.gome.mapper.QaQuestionReplyMapper;
import com.gome.pojo.QaQuestionReply;
import com.gome.service.QaQuestionReplyService;
import com.gome.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.gome.enums.ResultEnums.ANSWER_ERROR;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/7 21:28
 * @Modified By:
 */
@Service
public class QaQuestionReplyServiceImpl implements QaQuestionReplyService {
    @Autowired
    private QaQuestionReplyMapper questionReplyMapper;

    /**
     * 存入要答的题
     *
     * @param questionReplies
     * @return
     */
    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public ResultUtil insertQaQuestionReply(List<QaQuestionReply> questionReplies) {
        boolean b = true;
        for (QaQuestionReply questionReply : questionReplies) {
            int i = questionReplyMapper.insertSelective(questionReply);
            if (i != 1) {
                b = false;
            }
        }
        if (b) {
            return ResultUtil.ok();
        }
        return ResultUtil.build(ANSWER_ERROR.getStatus(), ANSWER_ERROR.getMsg());
    }
}
