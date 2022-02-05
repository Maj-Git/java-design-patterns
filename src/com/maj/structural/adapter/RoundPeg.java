package com.maj.structural.adapter;

/**
 * Classe qui décrit une cheville ronde avec un rayon.
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {
    }

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
