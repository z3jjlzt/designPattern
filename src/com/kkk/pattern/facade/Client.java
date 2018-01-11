package com.kkk.pattern.facade;

/**
 * 客户端
 * Created by z3jjlzt on 2018/1/10.
 */
public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.order("排骨汤");
        waiter.order("红烧鱼");
        waiter.pay(100);
    }
}
