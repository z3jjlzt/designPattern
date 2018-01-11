package com.kkk.pattern.facade;

import java.util.Random;

/**
 * 一个子系统
 * Created by z3jjlzt on 2018/1/10.
 */
public class Checkstand {
    private Checkstand(){}

    private static class Instance{
        private static final Checkstand c = new Checkstand();
    }

    public static Checkstand getInstance() {
        return Instance.c;
    }

    public void cashier(int money) {
        System.out.println("顾客支付 " + money + "元");
        int t = new Random().nextInt(100);
        System.out.println("应收" + t + "元");
        System.out.println("找零 " + (money - t) + "元");
    }
}
