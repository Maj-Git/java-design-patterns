package com.maj.structural.composite;

/**
 * Implémentation d'un composant produit (feuille de l'arborescence) qui a un prix.
 */
public class Product implements Component {
    private final double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
