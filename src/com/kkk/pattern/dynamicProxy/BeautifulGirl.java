package com.kkk.pattern.dynamicProxy;

/**
 * Created by kkk on 2016/4/16.
 */
public class BeautifulGirl implements interface1,interface2 {
    @Override
    public void buyBook() {
        System.out.println("buybook,i'm a gook gl!!!");
    }

    @Override
    public void buySkirt() {
        System.out.println("buySkirt,i'm a nice gl!!!");
    }
}
