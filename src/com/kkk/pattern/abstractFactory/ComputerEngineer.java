package com.kkk.pattern.abstractFactory;

/**
 * Created by kkk on 2016/9/8.
 */
public class ComputerEngineer {
    void makeComputer(PcPeripherals pcPeripherals){
        pcPeripherals.buyScreen();
        pcPeripherals.buyCpu();
    }
}
