package com.kkk.pattern.observe;

/**
 * Created by kkk on 2016/9/5.
 */
public class ObserverImp implements MObserver{
    private String name;
    private int mNmu;

    public ObserverImp(String name, int mNmu) {
        this.name = name;
        this.mNmu = mNmu;
    }

    @Override

    public void update(Subject subject) {
        SubjectImp subjectImp = (SubjectImp) subject;
        int luckyNum = subjectImp.getLuckyNum();
        System.out.println(name + "您的号码为 " + mNmu +"  幸运号码为  "+ luckyNum);
        if (mNmu==luckyNum)
            System.out.println("恭喜您中奖了");
        else
            System.out.println("很遗憾您未中奖");

    }
}
