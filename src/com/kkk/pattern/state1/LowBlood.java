package com.kkk.pattern.state1;

/**
 * Created by z3jjlzt on 2018/2/25.
 */
public class LowBlood extends Blood{
    @Override
    void report() {
        System.out.println("血线过低，无法参加战斗！！");
    }
}
