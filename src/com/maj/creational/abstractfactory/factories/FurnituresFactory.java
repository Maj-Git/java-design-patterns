package com.maj.creational.abstractfactory.factories;

import com.maj.creational.abstractfactory.AbstractChair;
import com.maj.creational.abstractfactory.AbstractSofa;

/**
 * Interface pour une fabrique qui construit des familles de produits.
 */
public interface FurnituresFactory {
    AbstractSofa createSofa();
    AbstractChair createChair();
}
