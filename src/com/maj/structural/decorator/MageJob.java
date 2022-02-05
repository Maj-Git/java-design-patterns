package com.maj.structural.decorator;

/**
 * Implémentation de la classe Mage.
 */
public class MageJob implements Job {
    @Override
    public String attack() {
        return "Mage attacks";
    }
}
