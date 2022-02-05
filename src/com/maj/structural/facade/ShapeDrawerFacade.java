package com.maj.structural.facade;

/**
 * La facade qui permet de dessiner toutes les formes souhaitées.
 */
public class ShapeDrawerFacade {
    private final Rectangle rectangle;
    private final Circle circle;
    private final Triangle triangle;

    public ShapeDrawerFacade(Rectangle rectangle, Circle circle, Triangle triangle) {
        this.rectangle = rectangle;
        this.circle = circle;
        this.triangle = triangle;
    }

    void drawRectangle() {
        System.out.println(rectangle.draw());
    }

    void drawCircle() {
        System.out.println(circle.draw());
    }

    void drawTriangle() {
        System.out.println(triangle.draw());
    }
}
