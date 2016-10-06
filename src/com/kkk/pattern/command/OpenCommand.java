package com.kkk.pattern.command;

/**
 * Created by kkk on 16-9-9.
 */
public class OpenCommand implements Command{
    /*
    通常会持有接受者
     */
    private MainBoard mainBoard = null;

    public OpenCommand(MainBoard mainBoard){
        this.mainBoard = mainBoard;
    }

    @Override
    public void exercise() {
        mainBoard.open();
    }
}
