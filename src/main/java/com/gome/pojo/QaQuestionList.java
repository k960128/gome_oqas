package com.gome.pojo;

public class QaQuestionList {
    private Integer id;

    private String questionTitle;

    private String questionType;

    private String answer;

    private Integer thisNumber;

    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle == null ? null : questionTitle.trim();
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getThisNumber() {
        return thisNumber;
    }

    public void setThisNumber(Integer thisNumber) {
        this.thisNumber = thisNumber;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "QaQuestionList{" +
                "id=" + id +
                ", questionTitle='" + questionTitle + '\'' +
                ", questionType='" + questionType + '\'' +
                ", answer='" + answer + '\'' +
                ", thisNumber=" + thisNumber +
                ", score=" + score +
                '}';
    }
}