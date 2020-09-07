package com.gome.pojo;

public class JudgesScores {
    private Integer id;

    private Integer judgesId;

    private String judgesName;

    private Double score;

    private Integer playerId;

    private String playerName;

    private String thisLinks;

    private Integer evaluationId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJudgesId() {
        return judgesId;
    }

    public void setJudgesId(Integer judgesId) {
        this.judgesId = judgesId;
    }

    public String getJudgesName() {
        return judgesName;
    }

    public void setJudgesName(String judgesName) {
        this.judgesName = judgesName == null ? null : judgesName.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName == null ? null : playerName.trim();
    }

    public String getThisLinks() {
        return thisLinks;
    }

    public void setThisLinks(String thisLinks) {
        this.thisLinks = thisLinks == null ? null : thisLinks.trim();
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }


    @Override
    public String toString() {
        return "JudgesScores{" +
                "id=" + id +
                ", judgesId=" + judgesId +
                ", judgesName='" + judgesName + '\'' +
                ", score=" + score +
                ", playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", thisLinks='" + thisLinks + '\'' +
                ", evaluationId=" + evaluationId +
                '}';
    }
}