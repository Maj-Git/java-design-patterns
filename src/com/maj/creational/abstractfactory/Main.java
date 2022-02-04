package com.maj.creational.abstractfactory;

import com.maj.creational.abstractfactory.factories.FurnituresFactory;
import com.maj.creational.abstractfactory.factories.ModernFurnituresFactory;

public class Main {
    /**
     * Démonstration du pattern Abstract factory.
     *
     * On instancie la fabrique de notre choix qui nous fournira les produits d'une famille de produits.
     */
    public static void main(String[] args) {
        FurnituresFactory furnituresFactory = new ModernFurnituresFactory();

        AbstractChair chair = furnituresFactory.createChair();
        AbstractSofa sofa = furnituresFactory.createSofa();
    }
}
