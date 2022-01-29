package com.maj.creational.builder.builders;

public interface Builder<T> {
    void setSeats(int number);
    void setEngine(String engine);
    void reset();
    T getResult();
}
