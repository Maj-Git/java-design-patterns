package com.maj.structural.facade;

/**
 * Un triangle que l'on peut dessiner
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        return "Drawing a triangle.";
    }
}
