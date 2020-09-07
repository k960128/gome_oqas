package com.gome.pojo;

public class GomeQaRule {
    private Integer id;

    private Integer thisLinks;

    private String title;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThisLinks() {
        return thisLinks;
    }

    public void setThisLinks(Integer thisLinks) {
        this.thisLinks = thisLinks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}