package com.maj.behavioral.mediator;

/**
 * Un bouton qui appelera une méthode pressButton() du médiateur lorqu'on appuiera dessus.
 */
public class Button {
    private final CoolingSystemMediator mediator;

    public Button(CoolingSystemMediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.pressButton();
    }
}
