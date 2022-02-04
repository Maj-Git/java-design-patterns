package com.maj.behavioral.visitor.shapes;

import com.maj.behavioral.visitor.visitors.ShapeVisitor;

/**
 * Interface pour une forme avec des coordonnées de départ.
 */
public interface Shape {
    int getX();
    int getY();
    void accept(ShapeVisitor visitor);
}
