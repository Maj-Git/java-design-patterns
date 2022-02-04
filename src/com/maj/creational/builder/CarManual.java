package com.maj.creational.builder;

/**
 * POJO d'un manuel de voiture
 */
public class CarManual {
    private int seats;
    private String engine;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "CarManual{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                '}';
    }
}
