package com.maj.structural.adapter;

/**
 * Classe qui décrit un trou rond avec un rayon.
 */
public class RoundHole {
    private final int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    /**
     * Une cheville ronde passe dans le trou si le rayon de la cheville est inférieure ou égale à celui du trou.
     * @param peg La cheville
     * @return True si ça passe, false sinon.
     */
    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
