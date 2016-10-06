package com.kkk.pattern.command;

/**
 * Created by kkk on 16-9-9.
 */
public class BoxInvoker {
    /*
    通常会持有Command命令对象。
     */
    private Command command = null;

    public BoxInvoker() {
    }

    public BoxInvoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void PressButten(){
        command.exercise();
    }

}
