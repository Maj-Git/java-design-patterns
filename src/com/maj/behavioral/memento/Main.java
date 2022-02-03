package com.maj.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        NumberOriginator originator = new NumberOriginator();
        NumbersCaretaker caretaker = new NumbersCaretaker(originator);

        originator.setValue(1);
        caretaker.save();
        originator.setValue(2);
        caretaker.save();
        originator.setValue(4);
        caretaker.save();
        originator.setValue(3);

        System.out.println(originator.getValue());
        caretaker.restore();
        System.out.println(originator.getValue());
        caretaker.restore();
        System.out.println(originator.getValue());
        caretaker.restore();
        System.out.println(originator.getValue());
        caretaker.restore();
        System.out.println(originator.getValue());
    }
}
