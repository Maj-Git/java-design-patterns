package com.maj.behavioral.observer;

public class Subscriber<T> {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(T data) {
        System.out.printf("%s updated with %s%n", name, data);
    }
}
