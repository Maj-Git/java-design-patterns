package com.maj.behavioral.mediator;

/**
 * Le médiateur qui permet la communication entre le bouton, le ventilateur et le fournisseur de courant
 */
public class CoolingSystemMediator {
    private Fan fan;
    private PowerSupply powerSupply;

    public CoolingSystemMediator() {
    }

    /**
     * Allume ou coupe le ventilateur selon son état actuel.
     */
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

    /**
     * Démarre le courant.
     */
    public void start() {
        if (powerSupply == null)
            return;

        powerSupply.turnOn();
    }

    /**
     * Coupe le courant.
     */
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
