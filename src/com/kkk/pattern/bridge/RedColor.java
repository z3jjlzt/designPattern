package com.kkk.pattern.bridge;

public class RedColor implements IColor{
    @Override
    public void printColor() {
        System.out.println("red");
    }
}
