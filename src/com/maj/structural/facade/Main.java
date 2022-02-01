package com.maj.structural.facade;

public class Main {
    public static void main(String[] args) {
        ShapeDrawerFacade shapeDrawer = new ShapeDrawerFacade(
                new Rectangle(),
                new Circle(),
                new Triangle()
        );

        shapeDrawer.drawRectangle();
        shapeDrawer.drawCircle();
        shapeDrawer.drawTriangle();
    }
}
