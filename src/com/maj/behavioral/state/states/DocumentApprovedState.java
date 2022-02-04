package com.maj.behavioral.state.states;

public class DocumentApprovedState extends DocumentState {

    @Override
    public void render() {
        System.out.printf("Document %s is approved.%n", document.getName());
    }

    /**
     * Le document est déjà approuvé, rien de plus à faire.
     */
    @Override
    public void publish() {
    }
}
