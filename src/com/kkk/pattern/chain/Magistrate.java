package com.kkk.pattern.chain;

/**
 * 县令，充当具体处理者。
 * Created by z3jjlzt on 2018/1/11.
 */
public class Magistrate extends Official{

    @Override
    public void handleReq(int level) {
        if (level <= Lawsuit.LEVEL_1) {
            System.out.println("本县令又可以受贿了，好开心！！！");
        } else {
            System.out.println("这么大的案件，我可不敢自己管，感觉交给上司！！！");
            successor.handleReq(level);
        }
    }
}
