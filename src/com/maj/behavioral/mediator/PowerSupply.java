package com.maj.behavioral.mediator;

public class PowerSupply {
    private boolean isOn;

    public PowerSupply(CoolingSystemMediator mediator) {
        mediator.setPowerSupply(this);
    }

    public void turnOn() {
        System.out.println("Turning power ON");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Turning power OFF");
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
