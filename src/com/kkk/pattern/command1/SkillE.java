package com.kkk.pattern.command1;

/**
 * E技能，充当具体命令类。
 * Created by z3jjlzt on 2018/1/12.
 */
public class SkillE extends Skill{
    @Override
    public void play() {
        LOLRole.action("E");
    }
}
