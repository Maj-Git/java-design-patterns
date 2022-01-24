package com.maj.structural.adapter;

public class Main {
    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg(5);
        RoundHole roundHole = new RoundHole(5);

        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(12);
        SquarePegRoundHoleAdapter adapter = new SquarePegRoundHoleAdapter(squarePeg);

        System.out.println(roundHole.fits(adapter));

    }
}
