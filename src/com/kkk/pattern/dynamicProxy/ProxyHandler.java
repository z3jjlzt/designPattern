package com.kkk.pattern.dynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kkk on 2016/4/16.
 */
public class ProxyHandler implements InvocationHandler{
    private Object target;
    public ProxyHandler(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("u pay $2 !!");
        method.invoke(target,args);
        System.out.println("welcome next time!!");
        return null;
    }
}
