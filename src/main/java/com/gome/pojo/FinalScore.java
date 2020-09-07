package com.gome.pojo;

public class FinalScore {
    private Integer id;

    private String thisLinks;

    private String userPersonsName;

    private String userName;

    private String competitionOrder;

    private Double finalScore;

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

    public String getUserPersonsName() {
        return userPersonsName;
    }

    public void setUserPersonsName(String userPersonsName) {
        this.userPersonsName = userPersonsName == null ? null : userPersonsName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCompetitionOrder() {
        return competitionOrder;
    }

    public void setCompetitionOrder(String competitionOrder) {
        this.competitionOrder = competitionOrder == null ? null : competitionOrder.trim();
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }


    @Override
    public String toString() {
        return "FinalScore{" +
                "id=" + id +
                ", thisLinks='" + thisLinks + '\'' +
                ", userPersonsName='" + userPersonsName + '\'' +
                ", userName='" + userName + '\'' +
                ", competitionOrder='" + competitionOrder + '\'' +
                ", finalScore=" + finalScore +
                '}';
    }
}