package com.maj.creational.abstractfactory;

public class Main {
    private static FurnituresFactory furnituresFactory;

    public static void main(String[] args) {
        furnituresFactory = new ModernFurnituresFactory();
        AbstractChair chair = furnituresFactory.createChair();
        AbstractSofa sofa = furnituresFactory.createSofa();
    }
}
