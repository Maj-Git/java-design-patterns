package com.maj.creational.singleton;

public class Main {
    /**
     * Démonstration du pattern Singleton
     */
    public static void main(String[] args) {
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("Hello world !");

        System.out.println(singleton.getValue());
    }
}
