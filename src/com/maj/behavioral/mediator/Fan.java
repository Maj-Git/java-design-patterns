package com.maj.behavioral.mediator;

public class Fan {
    private final CoolingSystemMediator mediator;
    private boolean isOn;

    public Fan(CoolingSystemMediator mediator) {
        this.mediator = mediator;
        this.mediator.setFan(this);
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    public boolean isOn() {
        return isOn;
    }
}
