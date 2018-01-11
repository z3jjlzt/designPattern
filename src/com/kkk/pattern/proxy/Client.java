package com.kkk.pattern.proxy;

/**
 * Created by z3jjlzt on 2018/1/11.
 */
public class Client {

    public static void main(String[] args) {

        SSClient client = new SSClient();
        System.out.println(client.visitSite("www.baidu.com"));
        System.out.println(client.visitSite("www.google.com"));
    }
}
