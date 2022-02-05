package com.maj.structural.decorator;

/**
 * Spécialisation Mage noir pour un mage.
 */
public class BlackMageSpecialization extends AbstractSpecialization {
    public BlackMageSpecialization(Job job) {
        super(job);

        if (!(job instanceof MageJob))
            throw new IllegalArgumentException("Il faut être mage pour devenir mage noir.");
    }

    @Override
    public String attack() {
        return "%s with black magic".formatted(super.attack());
    }
}
