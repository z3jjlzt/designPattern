package com.kkk.pattern.command1;

/**
 * 技能接口，充当抽象命令类。
 * Created by z3jjlzt on 2018/1/12.
 */
public abstract class Skill {
    //持有接受者引用。
    protected LOLRole LOLRole;

    protected void setLOLRole(LOLRole LOLRole) {
        this.LOLRole = LOLRole;
    }

    public abstract void play();
}
