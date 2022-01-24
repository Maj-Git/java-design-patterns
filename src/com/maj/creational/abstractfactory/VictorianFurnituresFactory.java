package com.maj.creational.abstractfactory;

public class VictorianFurnituresFactory implements FurnituresFactory {
    @Override
    public AbstractSofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public AbstractChair createChair() {
        return new VictorianChair();
    }
}
