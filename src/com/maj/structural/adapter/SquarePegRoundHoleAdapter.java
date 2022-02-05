package com.maj.structural.adapter;

/**
 * Un adapteur qui doit permettre d'adapter une cheville carrée pour pouvoir la faire passer dans un trou rond.
 */
public class SquarePegRoundHoleAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegRoundHoleAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
