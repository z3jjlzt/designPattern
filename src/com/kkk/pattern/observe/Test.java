package com.kkk.pattern.observe;

import java.util.Random;

/**
 * Created by kkk on 2016/9/5.
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new SubjectImp();
        MObserver a = new ObserverImp("a",5);
        MObserver b = new ObserverImp("b",24);
        MObserver c = new ObserverImp("c",23);
        subject.attach(a);
        subject.attach(b);
        subject.attach(c);
    //    subject.detach(a);
        ((SubjectImp)subject).setLuckyNum(new Random().nextInt(30));
//        subject.Notify();
    }


}
