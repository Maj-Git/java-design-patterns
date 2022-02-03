package com.maj.behavioral.mediator;


public class Button {
    private final CoolingSystemMediator mediator;

    public Button(CoolingSystemMediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.pressButton();
    }
}
