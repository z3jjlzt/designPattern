package com.kkk.pattern.facade;

/**
 * 充当外观类
 * Created by z3jjlzt on 2018/1/10.
 */
public class Waiter {
    private Kitchen kitchen = Kitchen.getInstance();
    private Checkstand checkstand = Checkstand.getInstance();

    public void order(String food) {
        kitchen.cook(food);
    }

    public void pay(int money) {
        checkstand.cashier(money);
    }
}
