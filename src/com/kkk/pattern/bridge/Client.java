package com.kkk.pattern.bridge;

public class Client {
    public static void main(String[] args) {
    IColor color = new BlueColor();
    Pan pan = new GiantPan();
    pan.setiColor(color);
    pan.draw();
    }
}
