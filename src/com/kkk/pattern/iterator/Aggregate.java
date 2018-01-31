package com.kkk.pattern.iterator;

/**
 * 充当抽象聚合类。
 * Created by z3jjlzt on 2018/1/31.
 */
public abstract class Aggregate {
    public abstract IIterator createIterator();
}
