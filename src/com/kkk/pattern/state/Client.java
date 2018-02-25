package com.kkk.pattern.state;

/**
 * 此方式使用具体状态类控制状态的转变.
 * Created by z3jjlzt on 2018/2/25.
 */
public class Client {
    public static void main(String[] args) {
        ICar car = new Maserati();
        car.setSpeed(40);
        car.setGears(new NormalGears(car));
        car.speedUp();
        car.speedUp();
        car.slowDown();
        car.slowDown();
        car.slowDown();
        car.slowDown();
    }
}
