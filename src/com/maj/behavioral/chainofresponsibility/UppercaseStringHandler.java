package com.maj.behavioral.chainofresponsibility;

import java.util.Locale;

/**
 * Handler qui transforme une chaine de caractères en la passant en majuscules.
 */
public class UppercaseStringHandler extends AbstractHandler {
    @Override
    public void handle(String request) {
        super.handle(request.toUpperCase(Locale.ROOT));
    }
}
