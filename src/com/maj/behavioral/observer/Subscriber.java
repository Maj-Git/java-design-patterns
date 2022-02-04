package com.maj.behavioral.observer;

/**
 * Le subscriber (l'observeur) reçoit les nouvelles valeurs en provenance du publisher (l'observé)
 * via la methode update().
 * @param <T>
 */
public class Subscriber<T> {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(T data) {
        System.out.printf("%s updated with %s%n", name, data);
    }
}
