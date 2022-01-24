package com.maj.behavioral.chainofresponsibility;

import java.util.Locale;

public class UppercaseStringHandler extends AbstractHandler {
    @Override
    public void handle(String request) {
        super.handle(request.toUpperCase(Locale.ROOT));
    }
}
