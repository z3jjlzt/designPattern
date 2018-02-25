package com.kkk.pattern.state;

/**
 * 车速，充当状态类。
 * Created by z3jjlzt on 2018/2/25.
 */
public abstract class Gears {

    ICar car;
    public abstract void speedUp();
    public abstract void slowDown();
    public abstract void checkState() ;
}
