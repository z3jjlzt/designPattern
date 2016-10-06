package com.kkk.pattern.abstractFactory;

/**
 * Created by kkk on 2016/9/8.
 */
public class Test {
    public static void main(String[] args) {
        LenovoFactory factory = LenovoFactory.getInstance();
        ComputerEngineer computerEngineer  = new ComputerEngineer();
        computerEngineer.makeComputer(factory);
    }
}
