package com.kkk.pattern;

import java.util.function.Consumer;

/**
 * Created by z3jjlzt on 2018/1/8.
 */
public class TestLambda {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("hello lambda!");
    }
}
