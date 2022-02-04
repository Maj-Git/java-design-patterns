package com.maj.behavioral.chainofresponsibility;

/**
 * Un handler effectue une action sur une donnée d'entrée puis envoie cette donnée au prochain handler si nécessaire.
 */
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
