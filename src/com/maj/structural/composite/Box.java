package com.maj.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private final List<Component> components;

    public Box() {
        components = new ArrayList<>();
    }

    public Box(List<Component> components) {
        this.components = components;
    }

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
