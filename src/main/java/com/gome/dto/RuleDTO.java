package com.gome.dto;

/**
 * @Description: 分数表
 * @Author: WangJinYue
 * @Date: 2020/8/19 4:14
 * @Modified By:
 */
public class RuleDTO {
    private String userName;
    private Double one;
    private Double two;
    private Double three;
    private Double four;
    private Double five;
    private Double num;
    private Integer ranking;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getOne() {
        return one;
    }

    public void setOne(Double one) {
        this.one = one;
    }

    public Double getTwo() {
        return two;
    }

    public void setTwo(Double two) {
        this.two = two;
    }

    public Double getThree() {
        return three;
    }

    public void setThree(Double three) {
        this.three = three;
    }

    public Double getFour() {
        return four;
    }

    public void setFour(Double four) {
        this.four = four;
    }

    public Double getFive() {
        return five;
    }

    public void setFive(Double five) {
        this.five = five;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
