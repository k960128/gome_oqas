package com.gome.pojo;

public class DebateUser {
    private Integer id;

    private String userPersonsName;

    private String photoUrl;

    private String competitionOrder;

    private Integer debateStatu;

    private Integer debateSort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserPersonsName() {
        return userPersonsName;
    }

    public void setUserPersonsName(String userPersonsName) {
        this.userPersonsName = userPersonsName == null ? null : userPersonsName.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public String getCompetitionOrder() {
        return competitionOrder;
    }

    public void setCompetitionOrder(String competitionOrder) {
        this.competitionOrder = competitionOrder == null ? null : competitionOrder.trim();
    }

    public Integer getDebateStatu() {
        return debateStatu;
    }

    public void setDebateStatu(Integer debateStatu) {
        this.debateStatu = debateStatu;
    }

    public Integer getDebateSort() {
        return debateSort;
    }

    public void setDebateSort(Integer debateSort) {
        this.debateSort = debateSort;
    }

    @Override
    public String toString() {
        return "DebateUser{" +
                "id=" + id +
                ", userPersonsName='" + userPersonsName + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", competitionOrder='" + competitionOrder + '\'' +
                ", debateStatu=" + debateStatu +
                ", debateSort=" + debateSort +
                '}';
    }
}