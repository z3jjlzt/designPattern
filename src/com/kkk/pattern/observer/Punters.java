package com.kkk.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 彩民
 * Created by z3jjlzt on 2018/2/10.
 */
public class Punters implements Observer {

    private int luckyNum;

    public Punters() {
    }

    public Punters(int luckyNum) {
        this.luckyNum = luckyNum;
    }

    public int getLuckyNum() {
        return luckyNum;
    }

    public void setLuckyNum(int luckyNum) {
        this.luckyNum = luckyNum;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (((GamblingHouse) o).getLuckyNum() == this.luckyNum) {
            System.out.println("恭喜你中奖了 ：" + luckyNum);
        } else {
            System.out.println("未中奖" + ((GamblingHouse) o).getLuckyNum());
        }
    }
}
