package com.maj.behavioral.visitor;

import com.maj.behavioral.visitor.shapes.Circle;
import com.maj.behavioral.visitor.shapes.Rectangle;
import com.maj.behavioral.visitor.shapes.Shape;
import com.maj.behavioral.visitor.visitors.PrintShapeVisitor;
import com.maj.behavioral.visitor.visitors.ShapeVisitor;

import java.util.List;

public class Main {
    /**
     * Démonstration du pattern Visitor
     *
     * Chaque forme de la collection shapes accepte le visiteur
     * qui va afficher sa description dans la console.
     */
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(0, 0, 5),
                new Rectangle(10, 0, 50, 30)
        );

        ShapeVisitor printVisitor = new PrintShapeVisitor();

        shapes.forEach(shape -> shape.accept(printVisitor));
    }
}
