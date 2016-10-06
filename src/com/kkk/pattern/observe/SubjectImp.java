package com.kkk.pattern.observe;

/**
 * Created by kkk on 2016/9/5.
 */
public class SubjectImp extends Subject {
    /**
     * 幸运开奖号
     */
    private int luckyNum;

    public int getLuckyNum() {
        return luckyNum;
    }

    /**
     * 开奖
     * @param luckyNum
     */
    public void setLuckyNum(int luckyNum) {
        this.luckyNum = luckyNum;
        this.Notify();
    }

}
