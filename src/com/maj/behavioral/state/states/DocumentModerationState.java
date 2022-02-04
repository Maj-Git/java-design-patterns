package com.maj.behavioral.state.states;

public class DocumentModerationState extends DocumentState {
    private final String comment;

    public DocumentModerationState(int numberOfErrors) {
        this.comment = "Moderation: %d errors found in the document.".formatted(numberOfErrors);
    }

    @Override
    public void render() {
        System.out.println(this.comment);
    }

    @Override
    public void publish() {
        int numberOfErrors = document.getNumberOfErrors();
        if (numberOfErrors > 0) {
            document.setState(new DocumentModerationState(numberOfErrors));
        } else {
            document.setState(new DocumentApprovedState());
        }
    }
}
