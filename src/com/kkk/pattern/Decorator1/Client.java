package com.kkk.pattern.Decorator1;

/**
 * Created by z3jjlzt on 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        Component c1,c2,c3;
        c1 = new ConcreteComponent();
        c2 = new Damage(c1);
        c3 = new Crit(c2);
        c2.operator();
        c3.operator();
    }
}
