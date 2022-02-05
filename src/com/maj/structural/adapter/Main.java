package com.maj.structural.adapter;

public class Main {
    /**
     * Démonstration du pattern Adapter.
     *
     * Notre adapteur se comporte comme une cheville ronde en exposant un rayon à partir des données
     * de la cheville carrée qu'il adapte (wrappe).
     */
    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg(5);
        RoundHole roundHole = new RoundHole(5);

        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(12);
        SquarePegRoundHoleAdapter adapter = new SquarePegRoundHoleAdapter(squarePeg);

        System.out.println(roundHole.fits(adapter));

    }
}
