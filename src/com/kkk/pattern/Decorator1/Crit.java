package com.kkk.pattern.Decorator1;

/**
 * Created by z3jjlzt on 2018/1/9.
 */
public class Crit extends Decorator{
    public Crit(Component component) {
        super(component);
    }

    public void operator() {
        super.operator();
        System.out.println(" 加上无尽之刃");
    }
}
