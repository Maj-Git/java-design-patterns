package com.maj.behavioral.visitor.shapes;

import com.maj.behavioral.visitor.visitors.ShapeVisitor;

public interface Shape {
    int getX();
    int getY();
    void accept(ShapeVisitor visitor);
}
