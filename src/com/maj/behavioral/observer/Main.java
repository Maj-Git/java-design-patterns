package com.maj.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Publisher<Integer> publisher = new Publisher<>();
        publisher.subscribe(new Subscriber<>("Sub 1"));
        publisher.subscribe(new Subscriber<>("Sub 2"));

        publisher.notifySubscribers(33);
    }
}
