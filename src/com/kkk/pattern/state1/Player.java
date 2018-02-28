package com.kkk.pattern.state1;

/**
 * 游戏角色，充当环境类Context.
 * Created by z3jjlzt on 2018/2/25.
 */
public class Player {
    //持有所有状态
    private Blood currentBlood, dead, lowBlood, normalBlood, highBlood;

    //生命值，状态受到生命值影响.
    private int hp = 600;

    public Player() {
        dead = new Dead();
        lowBlood = new LowBlood();
        normalBlood = new NormalBlood();
        highBlood = new HighBlood();
        currentBlood = normalBlood;
    }

    public void heal(int blood) {
        if (hp <= 0) {
            System.out.printf("已经阵亡，无法治疗！！");
        }
        hp += blood;
        checkState();
    }

    public void hurt(int blood) {
        if (hp <= 0) {
            System.out.printf("已经阵亡，无法选中！");
        }
        hp = hp - blood >= 0 ? hp - blood : 0;
        checkState();
    }

    private void checkState() {
        if (hp <= 0) {
            currentBlood = dead;
        } else if (hp <= 100) {
            currentBlood = lowBlood;
        } else if (hp < 600) {
            currentBlood = normalBlood;
        } else {
            currentBlood = highBlood;
        }
        currentBlood.report();
        System.out.println(hp);
    }

}
