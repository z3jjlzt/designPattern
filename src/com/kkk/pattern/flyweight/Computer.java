package com.kkk.pattern.flyweight;

/**
 * 充当外部状态
 * Created by z3jjlzt on 2018/1/10.
 */
public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Computer{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
