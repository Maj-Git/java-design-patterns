package com.maj.structural.composite;

public class Product implements Component {
    private final double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
