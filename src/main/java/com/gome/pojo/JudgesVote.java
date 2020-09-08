package com.gome.pojo;

public class JudgesVote {
    private Integer id;

    private String thisLinks;

    private Integer questionId;

    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThisLinks() {
        return thisLinks;
    }

    public void setThisLinks(String thisLinks) {
        this.thisLinks = thisLinks == null ? null : thisLinks.trim();
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}