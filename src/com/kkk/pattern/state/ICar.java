package com.kkk.pattern.state;

/**
 * 汽车接口。
 * Created by z3jjlzt on 2018/2/25.
 */

public abstract class ICar {

    int speed;

    Gears gears;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Gears getGears() {
        return gears;
    }

    public void setGears(Gears gears) {
        this.gears = gears;
    }

    public abstract void speedUp();
    public abstract void slowDown();
}
