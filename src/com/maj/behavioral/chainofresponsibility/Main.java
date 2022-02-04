package com.maj.behavioral.chainofresponsibility;

public class Main {

    /**
     * Démonstration du pattern Chain of responsibility.
     *
     * Notre requête est une simple String qui passe de Handler en handler.
     */
    public static void main(String[] args) {
        String hello = "hello world !";
        Handler uppercase = new UppercaseStringHandler();
        Handler leet = new LeetStringHandler();
        Handler print = new PrintStringHandler();

        uppercase.setNext(leet);
        leet.setNext(print);

        // La chaine sera passé en majuscules, puis transformée en "leet", puis affichée dans la console.
        uppercase.handle(hello);
    }
}
