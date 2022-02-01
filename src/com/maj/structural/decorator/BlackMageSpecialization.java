package com.maj.structural.decorator;

public class BlackMageSpecialization extends AbstractSpecialization {
    public BlackMageSpecialization(Job job) {
        super(job);
    }

    @Override
    public String attack() {
        return "%s with black magic".formatted(super.attack());
    }
}
