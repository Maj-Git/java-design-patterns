package com.maj.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Job mage = new MageJob();
        System.out.println(mage.attack());

        Job blackMage = new BlackMageSpecialization(mage);
        Job whiteMage = new WhiteMageSpecialization(mage);
        System.out.println(blackMage.attack());
        System.out.println(whiteMage.attack());

    }
}
