package com.kkk.pattern.undoCommand;

/**
 * Created by kkk on 2016/9/10.
 */
public class OperatorImp implements Operator{
    int result;

    public OperatorImp(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void add(int x) {
        System.out.print(result + " + " + x + " = ");
        result += x;
        System.out.println(result);
    }

    @Override
    public void substract(int x) {
        System.out.print(result + " - " + x + " = ");
        result -= x;
        System.out.println(result);
    }
}
