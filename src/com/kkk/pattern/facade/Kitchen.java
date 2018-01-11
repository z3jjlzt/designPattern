package com.kkk.pattern.facade;

/**
 * 一个子系统
 * Created by z3jjlzt on 2018/1/10.
 */
public class Kitchen {

    private Kitchen(){}

    private static class Instance{
        private static final Kitchen kitchen = new Kitchen();
    }

    public static Kitchen getInstance() {
        return Instance.kitchen;
    }
    public void cook(String foodname) {
        System.out.println("接到顾客点餐");
        System.out.println("正在制作美食 " + foodname);
        System.out.println("制作完成");
    }
}
