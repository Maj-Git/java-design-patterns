package com.maj.structural.adapter;

/**
 * Classe qui décrit une cheville carrée avec une largeur de côté.
 */
public class SquarePeg {
    private final int width;

    public SquarePeg(int width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
