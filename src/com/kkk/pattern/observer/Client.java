package com.kkk.pattern.observer;

/**
 * Created by z3jjlzt on 2018/2/10.
 */
public class Client {
    public static void main(String[] args) {
        Punters p1 = new Punters(8);
        Punters p2 = new Punters(24);
        GamblingHouse gamblingHouse = new GamblingHouse();
        gamblingHouse.addObserver(p1);
        gamblingHouse.addObserver(p2);
        gamblingHouse.publishNum();
        gamblingHouse.notifyObservers();
        gamblingHouse.publishNum();
        gamblingHouse.notifyObservers();
        gamblingHouse.publishNum();
        gamblingHouse.notifyObservers();
        gamblingHouse.publishNum();
        gamblingHouse.notifyObservers();
        gamblingHouse.publishNum();
        gamblingHouse.notifyObservers();
        gamblingHouse.publishNum();
        gamblingHouse.notifyObservers();
        gamblingHouse.publishNum();
        gamblingHouse.notifyObservers();
    }
}
