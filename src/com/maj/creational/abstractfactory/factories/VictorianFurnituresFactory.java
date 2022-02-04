package com.maj.creational.abstractfactory.factories;

import com.maj.creational.abstractfactory.AbstractChair;
import com.maj.creational.abstractfactory.AbstractSofa;
import com.maj.creational.abstractfactory.VictorianChair;
import com.maj.creational.abstractfactory.VictorianSofa;

/**
 * Une fabrique de fournitures de style victorien.
 */
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
