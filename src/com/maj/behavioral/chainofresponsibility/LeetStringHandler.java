package com.maj.behavioral.chainofresponsibility;

import java.util.Locale;

public class LeetStringHandler extends AbstractHandler {
    @Override
    public void handle(String request) {
        String nextRequest = request
                .replace('e', '3')
                .replace('E', '3')
                .replace('l', '1')
                .replace('L', '1');
        super.handle(nextRequest);
    }
}
