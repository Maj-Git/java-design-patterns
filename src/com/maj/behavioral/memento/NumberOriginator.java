package com.maj.behavioral.memento;

/**
 * Originator, celui qui encapsule la valeur dont on veut sauvegarder un historique.
 */
public class NumberOriginator {
    /**
     * La valeur à sauvegarder.
     */
    private int value;

    /**
     * Crée un memento de la valeur actuelle.
     * @return Le memento crée.
     */
    NumberMemento save() {
        return new NumberMemento(value);
    }

    /**
     * Restaure la valeur précédente selon le memento passé en paramètre.
     * @param memento Le memento de la valeur à restaurer.
     */
    void restore(NumberMemento memento) {
        value = memento.getValue();
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /**
     * Classe interne statique pour un memento.
     */
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
