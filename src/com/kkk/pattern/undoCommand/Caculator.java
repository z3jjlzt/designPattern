package com.kkk.pattern.undoCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by kkk on 2016/9/10.
 */
public class Caculator {
    /*
    invoker 持有 命令对象
     */
    private UndoOrRedo addCommand = null;
    private UndoOrRedo subCommand = null;
    private Stack<UndoOrRedo> list = new Stack<>();

    public void setSubCommand(UndoOrRedo subCommand) {
        this.subCommand = subCommand;
    }

    public void setAddCommand(UndoOrRedo addCommand) {
        this.addCommand = addCommand;
    }

    void pressAddButton(){
        addCommand.exercute();
        list.add(addCommand);
    }
    void pressSubButton(){
        subCommand.exercute();
        list.add(subCommand);
    }
    void pressUndo(){
        if(!list.isEmpty()) {
            UndoOrRedo command = list.pop();
            command.undo();
        }
    }
}
