package com.maj.creational.abstractfactory.factories;

import com.maj.creational.abstractfactory.AbstractChair;
import com.maj.creational.abstractfactory.AbstractSofa;
import com.maj.creational.abstractfactory.ModernChair;
import com.maj.creational.abstractfactory.ModernSofa;

/**
 * Une fabrique de fournitures de style moderne.
 */
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
