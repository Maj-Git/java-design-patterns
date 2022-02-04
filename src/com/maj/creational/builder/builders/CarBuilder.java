package com.maj.creational.builder.builders;

import com.maj.creational.builder.Car;

/**
 * Un builder qui construit des voitures.
 */
public class CarBuilder implements Builder<Car> {
    private Car car = new Car();

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public Car getResult() {
        return car;
    }
}
