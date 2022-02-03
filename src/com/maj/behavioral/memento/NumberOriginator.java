package com.maj.behavioral.memento;

public class NumberOriginator {
    private int value;

    NumberMemento save() {
        return new NumberMemento(value);
    }

    void restore(NumberMemento memento) {
        value = memento.getValue();
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static class NumberMemento {
        private final int value;

        NumberMemento(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
