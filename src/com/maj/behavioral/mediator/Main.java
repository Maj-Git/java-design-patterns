package com.maj.behavioral.mediator;

public class Main {

    /**
     * Démonstration du pattern Mediator, qui vise à réduire les dépendances entre des composants fortement couplés
     * en les faisant communiquer uniquement par l'intermédiaire d'un médiateur.
     */
    public static void main(String[] args) {
        CoolingSystemMediator mediator = new CoolingSystemMediator();
        PowerSupply powerSupply = new PowerSupply(mediator);
        Fan fan = new Fan(mediator);
        Button button = new Button(mediator);

        System.out.printf("Fan is %s%n", fan.isOn() ? "ON" : "OFF");
        button.press();
        System.out.printf("Fan is %s%n", fan.isOn() ? "ON" : "OFF");
        button.press();
        System.out.printf("Fan is %s%n", fan.isOn() ? "ON" : "OFF");

    }
}
