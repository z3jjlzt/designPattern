package com.kkk.pattern.command;

/**
 * Created by kkk on 16-9-9.
 */
public class GigaMainBoard implements MainBoard{
    @Override
    public void open() {
        System.out.println("Giga is opening...");
    }

    @Override
    public void restart() {
        System.out.println("Giga is restarting...");

    }
}
