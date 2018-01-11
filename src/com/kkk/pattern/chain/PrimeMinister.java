package com.kkk.pattern.chain;

/**
 * 丞相,充当具体处理者。
 * Created by z3jjlzt on 2018/1/11.
 */
public class PrimeMinister extends Official {
    @Override
    public void handleReq(int level) {
        if (level <= Lawsuit.LEVEL_3) {
            System.out.println("本相今天判他个100年！！！");
        } else {
            System.out.println("泱泱大国可不能毁在我手里呀，感觉通知圣上！！！");
            successor.handleReq(level);
        }
    }
}
