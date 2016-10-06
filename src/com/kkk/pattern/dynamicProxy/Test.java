package com.kkk.pattern.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by kkk on 2016/4/16.
 */
public class Test {
    public static void main(String[] agrs){
        //被代理类
        BeautifulGirl beautifulGirl= new BeautifulGirl();
        //jdk通过被代理类的classLoader和interafces动态创建该Proxy类的字节码；
        ClassLoader classLoader= beautifulGirl.getClass().getClassLoader();
      Class[] interafces =  beautifulGirl.getClass().getInterfaces();
        //代理类的处理方法
       ProxyHandler proxyHandler =  new ProxyHandler(beautifulGirl);
        //动态生成
       Object object = Proxy.newProxyInstance(classLoader,interafces, proxyHandler);
        (  (interface1)object).buyBook();
        (  (interface2)object).buySkirt();
    }
}
