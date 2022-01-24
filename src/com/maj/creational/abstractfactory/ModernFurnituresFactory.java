package com.maj.creational.abstractfactory;

public class ModernFurnituresFactory implements FurnituresFactory {
    @Override
    public AbstractSofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public AbstractChair createChair() {
        return new ModernChair();
    }
}
