package com.maj.creational.prototype;


public class Main {
    /**
     * Démonstration du pattern Prototype.
     */
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.setRadius(5);
        rectangle.setWidth(100);
        rectangle.setHeight(200);

        Circle cloneCircle = (Circle) circle.clone();
        Rectangle cloneRectangle = (Rectangle) rectangle.clone();

        System.out.printf("Clone circle's radius = %d", cloneCircle.getRadius());
        System.out.printf("Clone rectangle's width = %d and height = %d",
                cloneRectangle.getWidth(), cloneRectangle.getHeight());
    }
}
