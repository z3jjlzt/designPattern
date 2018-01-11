package com.kkk.pattern.chain;

import java.util.Random;

/**
 * 皇帝，充当具体处理者。
 * Created by z3jjlzt on 2018/1/11.
 */
public class Emperor extends Official {
    private Random random = new Random();

    //这是个昏君，处理国家大事也看心情。
    private int mood;

    public int getMood() {
        mood = random.nextInt(3);
        return mood;
    }

    @Override
    public void handleReq(int level) {
        switch (getMood()) {
            case 0:
                System.out.println("寡人今日心情欠佳，无心理会朝事");
                break;
            case 1:
                System.out.println("容我看看是谁吃了豹子胆，胆敢当卖国贼！！");
                break;
            default:
                System.out.println("陛下在睡觉！！！");
                break;
        }

    }
}
