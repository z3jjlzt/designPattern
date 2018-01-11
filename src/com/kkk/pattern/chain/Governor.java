package com.kkk.pattern.chain;

/**
 * 总督，充当具体处理者。
 * Created by z3jjlzt on 2018/1/11.
 */
public class Governor extends Official {
    @Override
    public void handleReq(int level) {
        if (level <= Lawsuit.LEVEL_2) {
            System.out.println("本总督好想处理大案件啊，可是却天天处理这些个破案件，真浪费了我的才华！！！");
        } else {
            System.out.println("好想自己处理啊，可是我没权利管，好可惜。。。");
            successor.handleReq(level);
        }
    }
}
