package com.maj.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Encapsule les races de chien dans une HashMap.
 */
public class BreedFactory {
    private static final Map<String, Breed> breeds = new HashMap<>();

    public static Breed getBreed(String name, String description) {
        Breed breed = breeds.get(name);
        if (breed == null) {
            breed = new Breed(name, description);
            breeds.put(name, breed);
        }

        return breed;
    }
}
