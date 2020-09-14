package com.gome.pojo;

public class FinalToscore {
    private Integer id;

    private Double firstScore;

    private Double secondScore;

    private Double threeScore;

    private Double fourScore;

    private Double fiveScore;

    private Double otherScore;

    private Double finalScore;

    private String userPersonsName;

    private Integer competitionOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(Double firstScore) {
        this.firstScore = firstScore;
    }

    public Double getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(Double secondScore) {
        this.secondScore = secondScore;
    }

    public Double getThreeScore() {
        return threeScore;
    }

    public void setThreeScore(Double threeScore) {
        this.threeScore = threeScore;
    }

    public Double getFourScore() {
        return fourScore;
    }

    public void setFourScore(Double fourScore) {
        this.fourScore = fourScore;
    }

    public Double getFiveScore() {
        return fiveScore;
    }

    public void setFiveScore(Double fiveScore) {
        this.fiveScore = fiveScore;
    }

    public Double getOtherScore() {
        return otherScore;
    }

    public void setOtherScore(Double otherScore) {
        this.otherScore = otherScore;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public String getUserPersonsName() {
        return userPersonsName;
    }

    public void setUserPersonsName(String userPersonsName) {
        this.userPersonsName = userPersonsName == null ? null : userPersonsName.trim();
    }

    public Integer getCompetitionOrder() {
        return competitionOrder;
    }

    public void setCompetitionOrder(Integer competitionOrder) {
        this.competitionOrder = competitionOrder;
    }
}