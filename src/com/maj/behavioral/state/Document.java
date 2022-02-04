package com.maj.behavioral.state;

import com.maj.behavioral.state.states.DocumentState;

/**
 * Le contexte.
 */
public class Document {
    private final String name;

    /**
     * L'état du document.
     */
    private DocumentState state;

    private int numberOfErrors;

    public Document(String name, DocumentState state) {
        this.name = name;
        setState(state);
    }

    public void render(){
        state.render();
    }

    public void publish() {
        state.publish();
    }

    public void setState(DocumentState state) {
        if (state != null) {
            this.state = state;
            state.setDocument(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getNumberOfErrors() {
        return numberOfErrors;
    }

    public void setNumberOfErrors(int numberOfErrors) {
        this.numberOfErrors = numberOfErrors;
    }
}
