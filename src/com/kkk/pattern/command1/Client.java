package com.kkk.pattern.command1;

/**
 * Created by z3jjlzt on 2018/1/12.
 */
public class Client {
    public static void main(String[] args) {
        Skill q, w, e, r;
        q = new SkillQ();
        w = new SkillW();
        e = new SkillE();
        r = new SkillR();
        LOLRole river = new LOLRole("River");
        q.setLOLRole(river);
        w.setLOLRole(river);
        e.setLOLRole(river);
        r.setLOLRole(river);
        HHKB hhkb = new HHKB();
        hhkb.addBtn("q", q)
                .addBtn("w", w)
                .addBtn("e", e)
                .addBtn("r", r);
        hhkb.pressBtn("e");
        hhkb.pressBtn("r");
        hhkb.pressBtn("w");
        hhkb.pressBtn("q");
        hhkb.pressBtn("r");
        hhkb.removeBtn("w");
        hhkb.pressBtn("w");
    }
}
