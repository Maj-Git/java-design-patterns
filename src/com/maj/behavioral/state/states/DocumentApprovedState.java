package com.maj.behavioral.state.states;

public class DocumentApprovedState extends DocumentState {

    @Override
    public void render() {
        System.out.printf("Document %s is approved.%n", document.getName());
    }

    @Override
    public void publish() {
    }
}
