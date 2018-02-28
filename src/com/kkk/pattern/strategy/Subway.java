package com.kkk.pattern.strategy;

/**
 * Created by z3jjlzt on 2018/2/28.
 */
public class Subway implements Strategy {
    @Override
    public void travel() {
        System.out.println("乘坐地铁上班！！");
    }
}
