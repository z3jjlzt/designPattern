package com.kkk.pattern.iterator;

/**
 * 充当抽象迭代器。
 * Created by z3jjlzt on 2018/1/31.
 */
public interface IIterator{
    Object first();
    Object next();
    Object currentItem();
    boolean hasNext();
}
