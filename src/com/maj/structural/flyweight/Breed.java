package com.maj.structural.flyweight;

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
