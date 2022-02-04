package com.maj.behavioral.visitor.shapes;

import com.maj.behavioral.visitor.visitors.ShapeVisitor;

/**
 * Classe décrivant un cercle avec des coordonnées de départ, une largeur et une hauteur.
 */
public class Rectangle extends AbstractShape {
    private final int width;
    private final int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    /**
     * La classe accepte un visiteur et appelle la méthode appropriée dessus.
     * @param visitor Le visiteur
     */
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitRectangle(this);
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
