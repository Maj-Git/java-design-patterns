package com.maj.behavioral.visitor.shapes;

import com.maj.behavioral.visitor.visitors.ShapeVisitor;

public class Circle extends AbstractShape {
    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
