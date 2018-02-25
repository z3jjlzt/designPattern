package com.kkk.pattern.state1;

/**
 * Created by z3jjlzt on 2018/2/25.
 */
public class NormalBlood extends Blood{
    @Override
    void report() {
        System.out.println("血线健康，可以参加战斗！！");
    }
}
