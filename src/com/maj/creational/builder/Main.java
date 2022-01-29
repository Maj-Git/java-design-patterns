package com.maj.creational.builder;

import com.maj.creational.builder.builders.CarBuilder;
import com.maj.creational.builder.builders.CarManualBuilder;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        carBuilder.setSeats(4);
        carBuilder.setEngine("Diesel");

        carManualBuilder.setSeats(4);
        carManualBuilder.setEngine("Diesel");

        System.out.println(carBuilder.getResult());
        System.out.println(carManualBuilder.getResult());
    }
}
