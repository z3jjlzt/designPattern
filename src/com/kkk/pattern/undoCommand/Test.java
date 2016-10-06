package com.kkk.pattern.undoCommand;

/**
 * Created by kkk on 2016/9/10.
 */
public class Test {
    public static void main(String[] args) {
        OperatorImp operatorImp = new OperatorImp(0);
        AddCommand add1 = new AddCommand(operatorImp,24);
        AddCommand add2 = new AddCommand(operatorImp,2);
        SubstarctCommand sub1 = new SubstarctCommand(operatorImp,23);
        Caculator caculator = new Caculator();
        caculator.setAddCommand(add1);
        caculator.setSubCommand(sub1);
        caculator.pressAddButton();
        caculator.pressSubButton();
        caculator.setAddCommand(add2);
        caculator.pressAddButton();
        caculator.pressUndo();
        caculator.pressUndo();
        caculator.pressUndo();
        caculator.pressUndo();

    }
}
