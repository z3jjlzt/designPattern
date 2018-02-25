package com.kkk.pattern.state;

import javax.swing.*;

/**
 * Created by z3jjlzt on 2018/2/25.
 */
public class HighGears extends Gears {

    public HighGears() {
    }

    public HighGears(ICar car) {
        this.car = car;
    }

    @Override
    public void speedUp() {
        car.setSpeed(car.getSpeed() + 30);
        checkState();
    }

    @Override
    public void slowDown() {
        car.setSpeed(car.getSpeed() - 30 >=0 ? car.getSpeed() - 30 : 0);
        checkState();
    }

    @Override
    public void checkState() {
        if (car.getSpeed() <= 20) {
            car.setGears(new LowGears(car));
        } else if (car.getSpeed() > 20 && car.getSpeed() < 100) {
            car.setGears(new NormalGears(car));
        }
    }
}
