package com.maj.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        final int numberOfDogs = 10000;
        for (int i = 0; i < numberOfDogs; i++) {
            Breed breed = i % 2 == 0
                    ? BreedFactory.getBreed("Beagle", "Good boy")
                    : BreedFactory.getBreed("Epagneul breton", "Also good boy");

            dogs.add(new Dog("Dog %d".formatted(i), 10, breed));
        }

        // Only two Breed instances are used instead of the number stored in numberOfDogs.
        dogs.forEach(System.out::println);
    }
}
