package com.kkk.pattern.command;

/**
 * Created by kkk on 16-9-9.
 */
public class RestartCommand implements Command {

    private MainBoard mainBoard = null;

    public RestartCommand(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void exercise() {

        mainBoard.restart();
    }
}
