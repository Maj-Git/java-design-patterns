package com.maj.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation d'une boite, qui peut contenir d'autres composants (produits ou boîtes dans cet exemple).
 */
public class Box implements Component {
    private final List<Component> components;

    public Box() {
        components = new ArrayList<>();
    }

    public Box(List<Component> components) {
        this.components = components;
    }

    /**
     * Calcule la somme du prix des composants enfants.
     * @return Le prix total de la boîte.
     */
    @Override
    public double getPrice() {
        return components.stream()
                .map(Component::getPrice)
                .reduce(0d, Double::sum);
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }
}
