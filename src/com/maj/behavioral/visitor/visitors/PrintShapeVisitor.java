package com.maj.behavioral.visitor.visitors;

import com.maj.behavioral.visitor.shapes.Circle;
import com.maj.behavioral.visitor.shapes.Rectangle;

/**
 * Un visiteur qui affiche dans la console la description de la forme visitée.
 */
public class PrintShapeVisitor implements ShapeVisitor {
    @Override
    public void visitCircle(Circle circle) {
        System.out.printf("Circle starts at (%d, %d) with a radius of %d%n",
                circle.getX(), circle.getY(), circle.getRadius());
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.printf("Rectangle starts at (%d, %d) and measures (%d, %d)%n",
                rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());

    }
}
