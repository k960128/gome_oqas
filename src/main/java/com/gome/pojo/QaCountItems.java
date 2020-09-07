package com.gome.pojo;

import java.util.Date;

public class QaCountItems {
    private Integer id;

    private Integer thisNumber;

    private String isEnable;

    private String respondent;

    private Date startTime;

    private String thisLinks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThisNumber() {
        return thisNumber;
    }

    public void setThisNumber(Integer thisNumber) {
        this.thisNumber = thisNumber;
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }

    public String getRespondent() {
        return respondent;
    }

    public void setRespondent(String respondent) {
        this.respondent = respondent == null ? null : respondent.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getThisLinks() {
        return thisLinks;
    }

    public void setThisLinks(String thisLinks) {
        this.thisLinks = thisLinks == null ? null : thisLinks.trim();
    }
}