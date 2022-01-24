package com.maj.behavioral.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        String hello = "hello world !";
        Handler uppercase = new UppercaseStringHandler();
        Handler leet = new LeetStringHandler();
        Handler print = new PrintStringHandler();
        uppercase.setNext(leet);
        leet.setNext(print);
        uppercase.handle(hello);
    }
}
