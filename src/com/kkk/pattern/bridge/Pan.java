package com.kkk.pattern.bridge;

public abstract class Pan {
    protected IColor iColor;

    public void setiColor(IColor iColor) {
        this.iColor = iColor;
    }

    public abstract void draw();
}
