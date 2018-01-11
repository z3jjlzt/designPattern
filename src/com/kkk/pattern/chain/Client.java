package com.kkk.pattern.chain;

/**
 * 客户端,负责创建职责链。
 * Created by z3jjlzt on 2018/1/11.
 */
public class Client {
    public static void main(String[] args) {
        Official o1,o2,o3,o4;
        o1 = new Magistrate();
        o2 = new Governor();
        o3 = new PrimeMinister();
        o4 = new Emperor();
        o1.setSuccessor(o2);
        o2.setSuccessor(o3);
        o3.setSuccessor(o4);

        o1.handleReq(1);
        System.out.println();
        o4.handleReq(2);
        System.out.println();
        o3.handleReq(3);
        System.out.println();
        o1.handleReq(4);
        System.out.println();
        o1.handleReq(4);
        System.out.println();
        o1.handleReq(4);
        System.out.println();
        o1.handleReq(4);
    }
}
