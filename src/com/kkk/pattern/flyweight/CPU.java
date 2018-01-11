package com.kkk.pattern.flyweight;

/**
 * 充当享元类
 * Created by z3jjlzt on 2018/1/10.
 */
public abstract class CPU {

    //获取内部状态
    public abstract String getCPUName();

    //注入外部状态
    public  void setComputer(Computer computer) {
        System.out.println("把型号为 " + getCPUName() + "的cpu安装在型号为 " + computer + "的电脑上");
    }
}
