package com.maj.behavioral.state.states;

public class DocumentDraftState extends DocumentState {

    @Override
    public void render() {
        System.out.printf("Draft of document %s.%n", document.getName());
    }

    @Override
    public void publish() {
        int numberOfErrors = document.getNumberOfErrors();
        if (numberOfErrors > 0) {
            document.setState(new DocumentModerationState(numberOfErrors));
        }
        else {
            document.setState(new DocumentApprovedState());
        }
    }
}
