package com.maj.creational.prototype;

/**
 * Classe qui décrit un rectangle avec des coordonnées de départ, une largeur et une hauteur.
 */
public class Rectangle extends AbstractShape {
    private int width;
    private int height;

    public Rectangle() {

    }

    /**
     * Le constructeur de copie est seulement accessible dans cette classe, on ne clone que via la méthode clone().
     * @param rectangle Le rectangle à copier.
     */
    private Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    /**
     * Implémentation concrète de la méthode de clonage qui retourne un nouveau rectangle avec les mêmes valeurs
     * que celui ci.
     * @return Le clone de ce rectangle.
     */
    @Override
    public AbstractShape clone() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
