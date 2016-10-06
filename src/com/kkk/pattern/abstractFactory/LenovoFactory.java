package com.kkk.pattern.abstractFactory;

/**
 * Created by kkk on 2016/9/8.
 */
public class LenovoFactory implements PcPeripherals{
    private static LenovoFactory minstance = null;
    private LenovoFactory(){}

    public static LenovoFactory getInstance(){
        if (minstance == null) {
            synchronized(LenovoFactory.class){
                if (minstance == null) {
                    minstance = new LenovoFactory();
                }
            }
        }
        return minstance;
    }

    @Override
    public void buyCpu() {
        Cpu cpu = new LenovoCpu();
        cpu.printInfo();
    }

    @Override
    public void buyScreen() {
       Screen screen = new LenoveScreen();
        screen.printInfo();
    }
}
