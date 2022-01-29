package com.maj.creational.builder.builders;

import com.maj.creational.builder.CarManual;

public class CarManualBuilder implements Builder<CarManual> {
    private CarManual carManual = new CarManual();

    @Override
    public void setSeats(int number) {
        carManual.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        carManual.setEngine(engine);
    }

    @Override
    public void reset() {
        carManual = new CarManual();
    }

    @Override
    public CarManual getResult() {
        return carManual;
    }
}
