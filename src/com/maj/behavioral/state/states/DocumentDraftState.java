package com.maj.behavioral.state.states;

/**
 * Etat initial d'un document, le document doit être passé en revue.
 */
public class DocumentDraftState extends DocumentState {

    @Override
    public void render() {
        System.out.printf("Draft of document %s.%n", document.getName());
    }

    /**
     * Si le document a des erreurs, il passe à en état "modération", sinon il est approuvé.
     */
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
