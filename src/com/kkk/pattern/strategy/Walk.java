package com.kkk.pattern.strategy;

/**
 * Created by z3jjlzt on 2018/2/28.
 */
public class Walk implements Strategy {
    @Override
    public void travel() {
        System.out.println("11路上班!!");
    }
}
