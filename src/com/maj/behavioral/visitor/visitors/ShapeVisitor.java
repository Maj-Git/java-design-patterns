package com.maj.behavioral.visitor.visitors;

import com.maj.behavioral.visitor.shapes.Circle;
import com.maj.behavioral.visitor.shapes.Rectangle;

/**
 * Interface pour une classe qui peut visiter des formes géométriques.
 */
public interface ShapeVisitor {
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
}
