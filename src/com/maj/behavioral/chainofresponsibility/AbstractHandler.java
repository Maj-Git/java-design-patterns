package com.maj.behavioral.chainofresponsibility;

public class AbstractHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void handle(String request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
