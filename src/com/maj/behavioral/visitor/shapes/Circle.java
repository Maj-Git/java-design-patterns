package com.maj.behavioral.visitor.shapes;

import com.maj.behavioral.visitor.visitors.ShapeVisitor;

/**
 * Classe décrivant un cercle avec des coordonnées de départ et un rayon.
 */
public class Circle extends AbstractShape {
    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    /**
     * La classe accepte un visiteur et appelle la méthode appropriée dessus.
     * @param visitor Le visiteur
     */
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
