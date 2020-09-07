package com.gome.pojo;

public class QaQuestionItems {
    private Integer id;

    private Integer questionId;

    private String showAnswer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getShowAnswer() {
        return showAnswer;
    }

    public void setShowAnswer(String showAnswer) {
        this.showAnswer = showAnswer == null ? null : showAnswer.trim();
    }
}