package com.maj.behavioral.chainofresponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handle(String request);
}
