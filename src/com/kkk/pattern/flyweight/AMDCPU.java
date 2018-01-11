package com.kkk.pattern.flyweight;

/**
 * 充当具体享元
 * Created by z3jjlzt on 2018/1/10.
 */
public class AMDCPU extends CPU {

    private AMDCPU() {}

    private static class Instance{
        private static final AMDCPU cpu = new AMDCPU();
    }

    public static AMDCPU getInstance() {
        return Instance.cpu;
    }

    @Override
    public String getCPUName() {
        return "AMD";
    }
}
