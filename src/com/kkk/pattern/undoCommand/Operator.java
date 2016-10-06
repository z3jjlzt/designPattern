package com.kkk.pattern.undoCommand;

/**
 * Created by kkk on 2016/9/10.
 */
public interface Operator {
    void setResult(int result);
    void add(int x);
    void substract(int x);
}
