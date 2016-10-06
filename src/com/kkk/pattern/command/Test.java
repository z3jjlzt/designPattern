package com.kkk.pattern.command;

/**
 * Created by kkk on 16-9-9.
 */
public class Test {
    public static void main(String[] args) {
        MainBoard giga = new GigaMainBoard();
        Command open = new OpenCommand(giga);
        Command restart = new RestartCommand(giga);
        BoxInvoker boxInvoker = new BoxInvoker();
        boxInvoker.setCommand(restart);
        boxInvoker.PressButten();
        boxInvoker.setCommand(open);
        boxInvoker.PressButten();

    }
}
