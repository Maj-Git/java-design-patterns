package com.maj.structural.flyweight;

/**
 * Une classe qui décrit une race de chien
 */
public class Breed {
    private final String name;
    private final String description;

    public Breed(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
