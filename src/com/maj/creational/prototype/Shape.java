package com.maj.creational.prototype;

/**
 * Interface pour une forme, qui définit une méthode de clonage.
 */
public interface Shape {
    Shape clone();
    int getX();
    int getY();
}
