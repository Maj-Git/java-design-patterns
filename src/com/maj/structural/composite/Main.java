package com.maj.structural.composite;

import java.util.List;

public class Main {
    /**
     * Démonstration du pattern Composite.
     *
     * On peut manipuler les composants via l'interface Component et construire une arborescence
     * de composants dont on peut obtenir le prix total.
     */
    public static void main(String[] args) {
        Component product = new Product(10);
        Component boxedProduct = new Product(3);
        Component boxedProduct2 = new Product(7);
        Component childBox = new Box(List.of(boxedProduct, boxedProduct2));
        Component parentBox = new Box(List.of(product, childBox));

        System.out.printf("Total price: %f $", parentBox.getPrice());
    }
}
