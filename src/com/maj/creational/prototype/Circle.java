package com.maj.creational.prototype;

/**
 * Classe qui décrit un cercle avec des coordonnées de départ et un rayon.
 */
public class Circle extends AbstractShape {
    private int radius;

    public Circle() {

    }

    /**
     * Le constructeur de copie est seulement accessible dans cette classe, on ne clone que via la méthode clone().
     * @param circle Le cercle à copier.
     */
    private Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    /**
     * Implémentation concrète de la méthode de clonage qui retourne un nouveau cercle avec les mêmes valeurs
     * que celui ci.
     * @return Le clone de ce cercle.
     */
    @Override
    public AbstractShape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
