package com.maj.creational.prototype;

/**
 * Implémentation abstraite d'une forme, avec des coordonées.
 */
public abstract class AbstractShape {
    private int x;
    private int y;

    public AbstractShape() {

    }

    /**
     * Le constructeur de copie est seulement accessible aux sous-classes.
     * @param shape La forme à copier.
     */
    protected AbstractShape(AbstractShape shape) {
        this.x = shape.x;
        this.y = shape.y;
    }

    public abstract AbstractShape clone();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
