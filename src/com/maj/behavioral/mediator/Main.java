package com.maj.behavioral.mediator;

public class Main {
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
