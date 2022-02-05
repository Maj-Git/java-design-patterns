package com.maj.structural.facade;

public class Main {
    /**
     * Démonstration du pattern Facade.
     *
     * ON instancie une facade et c'est elle qui fait office de controller,
     * dépend des formes et les dessine.
     */
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
