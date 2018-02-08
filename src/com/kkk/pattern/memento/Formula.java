package com.kkk.pattern.memento;

/**
 * 数学计算公式,充当原发器。
 * Created by z3jjlzt on 2018/2/5.
 */
public class Formula {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建一个备忘录。
     * @return
     */
    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setMstate(getState());
        return memento;
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getMstate();
    }

    public Memento op(String state) {
        Memento memento = createMemento();
        this.state = this.state + state;
        return memento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Formula{");
        sb.append("state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
