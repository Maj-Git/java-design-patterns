package com.maj.behavioral.memento;

import java.util.Stack;

/**
 * Le caretaker, qui maintient une référence vers l'originator et l'historique des mementos.
 */
public class NumbersCaretaker {
    private final NumberOriginator originator;
    private final Stack<NumberOriginator.NumberMemento> numbersHistory = new Stack<>();

    public NumbersCaretaker(NumberOriginator originator) {
        this.originator = originator;
    }

    public void save() {
        NumberOriginator.NumberMemento memento = originator.save();
        numbersHistory.push(memento);
    }

    public void restore() {
        if (numbersHistory.isEmpty())
            return;

        NumberOriginator.NumberMemento memento = numbersHistory.pop();
        originator.restore(memento);
    }
}
