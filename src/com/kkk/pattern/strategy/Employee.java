package com.kkk.pattern.strategy;

/**
 * 员工类，充当环境类Context。
 * Created by z3jjlzt on 2018/2/28.
 */
public class Employee {
    //出行方式
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void explain() {
        this.strategy.travel();
    }
}
