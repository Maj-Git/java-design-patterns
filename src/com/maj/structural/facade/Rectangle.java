package com.maj.structural.facade;

/**
 * Un rectangle que l'on peut dessiner
 */
public class Rectangle implements Shape {
    @Override
    public String draw() {
        return "Drawing a rectangle.";
    }
}
