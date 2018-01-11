package com.kkk.pattern.flyweight;

import java.util.HashMap;

/**
 * 充当共享池
 * Created by z3jjlzt on 2018/1/10.
 */
public class CPUFactory {

    private static HashMap<String, CPU> fpool = new HashMap<>();

    private CPUFactory() {
    }

    private static class Instance {
        private static final CPUFactory cf = new CPUFactory();
    }

    public static CPUFactory getInstance() {
        return Instance.cf;
    }

    public static CPU getCPU(String type) {
        if (null == fpool.get(type)) {
            switch (type) {
                case "AMD":
                    fpool.put("AMD", AMDCPU.getInstance());
                    break;
                case "Intel":
                    fpool.put("Intel", IntelCPU.getInstance());
                    break;
                default:
                    break;
            }
        }
        return fpool.get(type);
    }
}
