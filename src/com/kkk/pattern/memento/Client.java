package com.kkk.pattern.memento;

/**
 * Created by z3jjlzt on 2018/2/5.
 */
public class Client {
    public static void main(String[] args) {
        Formula formula = new Formula();
        formula.setState("1*3");
        MementoCaretaker caretaker = new MementoCaretaker();
        Memento op = formula.op("-4");
        caretaker.operator(op);
        Memento op1 = formula.op("*5");
        caretaker.operator(op1);
        Memento op2 = formula.op("/6");
        caretaker.operator(op2);
        System.out.println(formula);
        formula.restoreFromMemento(caretaker.undo(formula));
        System.out.println(formula);
        formula.restoreFromMemento(caretaker.redo(formula));
        System.out.println(formula);
        formula.restoreFromMemento(caretaker.undo(formula));
        System.out.println(formula);
        formula.restoreFromMemento(caretaker.undo(formula));
        System.out.println(formula);
        formula.restoreFromMemento(caretaker.undo(formula));
        System.out.println(formula);
        formula.restoreFromMemento(caretaker.redo(formula));
        System.out.println(formula);
        formula.restoreFromMemento(caretaker.redo(formula));
        System.out.println(formula);
        formula.restoreFromMemento(caretaker.redo(formula));
        System.out.println(formula);
    }
}
