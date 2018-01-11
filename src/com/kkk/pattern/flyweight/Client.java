package com.kkk.pattern.flyweight;

/**
 * Created by z3jjlzt on 2018/1/10.
 */
public class Client {
    public static void main(String[] args) {
        CPUFactory cpuFactory = CPUFactory.getInstance();
        CPU amd1 = cpuFactory.getCPU("AMD");
        CPU amd2 = cpuFactory.getCPU("AMD");
        CPU intel1 = cpuFactory.getCPU("Intel");
        System.out.println(amd1 == amd2);
        System.out.println(amd1 == intel1);
        amd1.setComputer(new Computer("新华同方"));
        intel1.setComputer(new Computer("华硕"));
    }
}
