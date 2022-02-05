package com.maj.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Démonstration du pattern Flyweight.
     *
     * On instancie un grand nombre de chiens, de deux races différentes.
     *
     * Plutôt que d'instancier également un grand nombre d'objet pour représenter la race d'un chien,
     * on utilisera notre BreedFactory pour nous fournir l'objet de la race d'un chien.
     *
     * On utilisera donc seulement en mémoire deux objets pour les races de nos chiens.
     */
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        final int numberOfDogs = 10000;
        for (int i = 0; i < numberOfDogs; i++) {
            Breed breed = i % 2 == 0
                    ? BreedFactory.getBreed("Beagle", "Good boy")
                    : BreedFactory.getBreed("Epagneul breton", "Also good boy");

            dogs.add(new Dog("Dog %d".formatted(i), 10, breed));
        }

        // Seules deux instances de la classe Breed sont utilisées (cf. les références mémoire affichées)
        dogs.forEach(System.out::println);
    }
}
