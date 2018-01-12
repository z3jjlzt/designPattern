package com.kkk.pattern.command1;

/**
 * LOLRole，充当技能的接受者。
 * Created by z3jjlzt on 2018/1/12.
 */
public class LOLRole {

    private String name;

    public LOLRole(String name) {
        this.name = name;
    }

    public void action(String action) {
        System.out.println(name + "释放了 " + action + "技能");
    }
}
