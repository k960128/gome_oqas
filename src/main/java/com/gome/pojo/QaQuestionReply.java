package com.gome.pojo;

public class QaQuestionReply {
    private Integer id;

    private String respoondent;

    private Integer questionId;

    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRespoondent() {
        return respoondent;
    }

    public void setRespoondent(String respoondent) {
        this.respoondent = respoondent == null ? null : respoondent.trim();
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}