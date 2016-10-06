package com.kkk.pattern.undoCommand;

/**
 * Created by kkk on 2016/9/10.
 */
public class SubstarctCommand implements UndoOrRedo{

    private Operator operator = null;
    int result;

    public SubstarctCommand(Operator operator, int result) {
        this.operator = operator;
        this.result = result;
    }

    @Override
    public void exercute() {
        operator.substract(result);
    }

    @Override
    public void undo() {
        operator.add(result);
    }

    @Override
    public void redo() {

    }
}
