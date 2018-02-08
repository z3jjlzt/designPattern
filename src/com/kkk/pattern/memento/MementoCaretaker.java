package com.kkk.pattern.memento;

import java.util.Stack;

/**
 * 负责类.作用仅仅是存储备忘录对象，而不允许改变备忘录对象。
 * Created by z3jjlzt on 2018/2/5.
 */
public class MementoCaretaker {
    private Stack<Memento> undolst = new Stack<>();
    private Stack<Memento> redolst = new Stack<>();

    /**
     * 进行新的操作.
     */
    public void operator(Memento memento) {
        redolst.clear();//先清空redo栈.
        undolst.push(memento);
    }

    public Memento undo(Formula formula) {
        redolst.push(formula.createMemento());
        return undolst.pop();
    }

    public Memento redo(Formula formula) {
        undolst.push(formula.createMemento());
        return redolst.pop();
    }
}
