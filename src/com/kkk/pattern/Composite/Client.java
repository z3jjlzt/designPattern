package com.kkk.pattern.Composite;

/**
 * Created by z3jjlzt on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        Component root = new Folder("C盘");
        Component f1 = new File("xx.jpg");
        Component f2 = new File("ss.mp4");
        Component fo1 = new Folder("script");
        Component f3 = new File("Test.sql");
        root.addChild(f1);
        root.addChild(f2);
        root.addChild(fo1);
        fo1.addChild(f3);
        root.display();
        fo1.display();
        fo1.removeChild(new File("Test.sql"));
        fo1.display();

    }
}
