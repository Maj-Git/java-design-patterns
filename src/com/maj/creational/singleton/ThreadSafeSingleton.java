package com.maj.creational.singleton;

import com.sun.jdi.VoidValue;

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