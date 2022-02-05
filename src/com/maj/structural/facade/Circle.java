package com.maj.structural.facade;

/**
 * Un cercle que l'on peut dessiner
 */
public class Circle implements Shape {
    @Override
    public String draw() {
        return "Drawing a circle.";
    }
}
