package com.kkk.pattern.memento;

/**
 * 备忘录类。
 * Created by z3jjlzt on 2018/2/5.
 */
class Memento {
    private String mstate;

    public String getMstate() {
        return mstate;
    }

    public void setMstate(String mstate) {
        this.mstate = mstate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Memento{");
        sb.append("mstate='").append(mstate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
