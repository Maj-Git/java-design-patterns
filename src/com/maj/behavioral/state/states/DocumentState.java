package com.maj.behavioral.state.states;


import com.maj.behavioral.state.Document;

public abstract class DocumentState {
    protected Document document;

    public DocumentState() {
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public abstract void render();
    public abstract void publish();
}
