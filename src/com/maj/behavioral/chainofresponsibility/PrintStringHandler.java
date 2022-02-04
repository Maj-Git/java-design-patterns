package com.maj.behavioral.chainofresponsibility;

/**
 * Handler qui affiche la chaîne de caractères en entrée dans la console.
 */
public class PrintStringHandler extends AbstractHandler {
    @Override
    public void handle(String request) {
        System.out.println(request);
        super.handle(request);
    }
}
