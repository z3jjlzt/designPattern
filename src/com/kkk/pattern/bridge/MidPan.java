package com.kkk.pattern.bridge;

public class MidPan extends Pan{
    @Override
    public void draw() {
        System.out.println("mid pan is draw ");
        iColor.printColor();
        System.out.println("draw done");
    }
}
