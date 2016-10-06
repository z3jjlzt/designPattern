package com.kkk.pattern.undoCommand;

/**
 * Created by kkk on 2016/9/10.
 */
public class AddCommand implements UndoOrRedo {
/*
 持有接受者对象
 */

    private Operator operator = null;
    int result;

    public AddCommand(Operator operator, int result) {
        this.operator = operator;
        this.result = result;
    }

    @Override
    public void exercute() {
        operator.add(result);
    }

    @Override
    public void undo() {
        operator.substract(result);
    }

    @Override
    public void redo() {

    }
}
