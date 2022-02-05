package com.maj.structural.decorator;

/**
 * Spécialisation Mage blanc pour un mage.
 */
public class WhiteMageSpecialization extends AbstractSpecialization {
    public WhiteMageSpecialization(Job job) {
        super(job);

        if (!(job instanceof MageJob))
            throw new IllegalArgumentException("Il faut être mage pour devenir mage blanc.");
    }

    @Override
    public String attack() {
        return "%s with white magic".formatted(super.attack());
    }
}
