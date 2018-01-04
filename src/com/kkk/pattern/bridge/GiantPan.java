package com.kkk.pattern.bridge;

public class GiantPan extends Pan {

    @Override
    public void draw() {
        System.out.println("giant pan is draw ");
        iColor.printColor();
        System.out.println("draw done");
    }
}
