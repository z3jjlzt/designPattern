package com.kkk.pattern.bridge;

public class BlueColor implements IColor{
    @Override
    public void printColor() {
        System.out.println("blue");
    }
}
