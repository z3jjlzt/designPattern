package com.kkk.pattern.state;

/**
 * 充当环境类.
 * Created by z3jjlzt on 2018/2/25.
 */
public class Maserati extends ICar {

    @Override
    public void speedUp() {
        gears.speedUp();
        System.out.println(speed);
        System.out.println(this.gears);
    }

    @Override
    public void slowDown() {
        gears.slowDown();
        System.out.println(speed);
        System.out.println(gears);
    }


}
