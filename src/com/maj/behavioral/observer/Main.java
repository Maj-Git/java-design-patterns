package com.maj.behavioral.observer;

public class Main {
    /**
     * Démonstration du pattern Observer.
     *
     * Le publisher a deux subscribers qui seront notifiés lorsqu'une nouvelle valeur sera disponible.
     */
    public static void main(String[] args) {
        Publisher<Integer> publisher = new Publisher<>();
        publisher.subscribe(new Subscriber<>("Sub 1"));
        publisher.subscribe(new Subscriber<>("Sub 2"));

        publisher.notifySubscribers(33);
    }
}
