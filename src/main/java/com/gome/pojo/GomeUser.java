package com.gome.pojo;

public class GomeUser {
    private Integer userId;

    private String userName;

    private String userPass;

    private String userStatu;

    private String userPersonsName;

    private String photoUrl;

    private String branch;

    private String isSubmitRobot;

    private String videoUrl;

    private Integer competitionOrder;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserStatu() {
        return userStatu;
    }

    public void setUserStatu(String userStatu) {
        this.userStatu = userStatu == null ? null : userStatu.trim();
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getIsSubmitRobot() {
        return isSubmitRobot;
    }

    public void setIsSubmitRobot(String isSubmitRobot) {
        this.isSubmitRobot = isSubmitRobot == null ? null : isSubmitRobot.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Integer getCompetitionOrder() {
        return competitionOrder;
    }

    public void setCompetitionOrder(Integer competitionOrder) {
        this.competitionOrder = competitionOrder;
    }

    @Override
    public String toString() {
        return "GomeUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userStatu='" + userStatu + '\'' +
                ", userPersonsName='" + userPersonsName + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", branch='" + branch + '\'' +
                ", isSubmitRobot='" + isSubmitRobot + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", competitionOrder=" + competitionOrder +
                '}';
    }
}