package com.maj.behavioral.memento;

public class Main {
    /**
     * Démonstration du pattern Memento.
     *
     * L'originator produit des valeurs et le caretaker permet la sauvegarde et la restauration des valeurs
     * empilées dans l'historique.
     */
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
