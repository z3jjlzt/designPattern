package com.kkk.pattern.flyweight;

/**
 * 充当具体享元
 * Created by z3jjlzt on 2018/1/10.
 */
public class IntelCPU extends CPU {

    private IntelCPU() {}

    private static class Instance{
        private static final IntelCPU cpu = new IntelCPU();
    }

    public static IntelCPU getInstance() {
        return Instance.cpu;
    }

    @Override
    public String getCPUName() {
        return "Intel";
    }
}
