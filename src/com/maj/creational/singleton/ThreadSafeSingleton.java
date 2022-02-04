package com.maj.creational.singleton;


/**
 * Notre singleton (thread-safe).
 *
 * Le constructeur est privé et la méthode getInstance() permet de récupérer l'instance unique de la classe.
 */
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private final String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        ThreadSafeSingleton result = instance;

        if (result != null) {
            return result;
        }

        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton(value);
            }

            return instance;
        }
    }
}
