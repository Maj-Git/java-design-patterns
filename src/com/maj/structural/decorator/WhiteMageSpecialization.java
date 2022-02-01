package com.maj.structural.decorator;

public class WhiteMageSpecialization extends AbstractSpecialization {
    public WhiteMageSpecialization(Job job) {
        super(job);
    }

    @Override
    public String attack() {
        return "%s with white magic".formatted(super.attack());
    }
}
