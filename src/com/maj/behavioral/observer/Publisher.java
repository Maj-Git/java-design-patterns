package com.maj.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Le publisher (l'observé) notifie tous ses subscribers (les observeurs) lorsqu'une nouvelle valeur est disponible.
 * @param <T>
 */
public class Publisher<T> {
    private final List<Subscriber<T>> subscribers = new ArrayList<>();

    public void subscribe(Subscriber<T> subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber<T> subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifySubscribers(T value) {
        subscribers.forEach(subscriber -> subscriber.update(value));
    }
}
