package com.kkk.pattern.command1;

/**
 * Q技能，充当具体命令类。
 * Created by z3jjlzt on 2018/1/12.
 */
public class SkillQ extends Skill{
    @Override
    public void play() {
        LOLRole.action("Q");
    }
}
