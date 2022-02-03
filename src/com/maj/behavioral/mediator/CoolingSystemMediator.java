package com.maj.behavioral.mediator;

public class CoolingSystemMediator {
    private Fan fan;
    private PowerSupply powerSupply;

    public CoolingSystemMediator() {
    }

    public void pressButton() {
        if (fan == null)
            return;

        if (fan.isOn()) {
            fan.turnOff();
        }
        else {
            fan.turnOn();
        }
    }

    public void start() {
        if (powerSupply == null)
            return;

        powerSupply.turnOn();
    }

    public void stop() {
        if (powerSupply == null)
            return;

        powerSupply.turnOff();
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }
}
