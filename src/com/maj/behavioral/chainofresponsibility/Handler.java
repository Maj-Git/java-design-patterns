package com.maj.behavioral.chainofresponsibility;

/**
 * Un handler effectue une action sur une donnée d'entrée puis envoie cette donnée au prochain handler si nécessaire.
 */
public interface Handler {
    void setNext(Handler handler);
    void handle(String request);
}
