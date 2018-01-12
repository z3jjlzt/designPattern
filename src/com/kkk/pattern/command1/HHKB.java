package com.kkk.pattern.command1;

import java.util.HashMap;
import java.util.Map;

/**
 * HHKB键盘，充当调用者。
 * Created by z3jjlzt on 2018/1/12.
 */
public class HHKB {
    //键盘上持有一系列按键集合。
    private static final Map<String, Skill> btns = new HashMap<>();

    public HHKB addBtn(String k, Skill v) {
        btns.put(k, v);
        return this;
    }

    public void removeBtn(String k) {
        btns.remove(k);
    }

    public void pressBtn(String btn) {
        if (btns.containsKey(btn)){
            btns.get(btn).play();
        } else {
            System.out.println(btn + "技能冷却中！！");
        }
    }
}
