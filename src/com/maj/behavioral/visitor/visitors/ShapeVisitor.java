package com.maj.behavioral.visitor.visitors;

import com.maj.behavioral.visitor.shapes.Circle;
import com.maj.behavioral.visitor.shapes.Rectangle;

public interface ShapeVisitor {
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
}
