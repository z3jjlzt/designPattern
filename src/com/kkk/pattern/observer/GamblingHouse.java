package com.kkk.pattern.observer;

import java.util.Observable;
import java.util.Random;

/**
 * 充当具体被观察者。
 * Created by z3jjlzt on 2018/2/10.
 */
public class GamblingHouse extends Observable {
    private static final Random random = new Random();

    public void publishNum() {
        setChanged();
    }

    public int getLuckyNum() {
        return random.nextInt(25);
    }

}
