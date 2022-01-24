package com.maj.behavioral.chainofresponsibility;

public class PrintStringHandler extends AbstractHandler {
    @Override
    public void handle(String request) {
        System.out.println(request);
        super.handle(request);
    }
}
