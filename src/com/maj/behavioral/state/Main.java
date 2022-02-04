package com.maj.behavioral.state;

import com.maj.behavioral.state.states.DocumentDraftState;

public class Main {
    /**
     * Démonstration du pattern State.
     *
     * On a des documents qui passe par une succession d'état,
     * un document commence en "draft", puis il passe en modération ou est approuvé directement...
     * Un document en modération, peut rester en modération ou bien être approuvé.
     */
    public static void main(String[] args) {
        Document document = new Document("Test document", new DocumentDraftState());
        Document document2 = new Document("Good document", new DocumentDraftState());
        document.render();
        document2.render();

        document.setNumberOfErrors(4);
        document.publish();
        document.render();
        document2.publish();
        document2.render();

        document.setNumberOfErrors(2);
        document.publish();
        document.render();

        document.setNumberOfErrors(0);
        document.publish();
        document.render();
    }
}
