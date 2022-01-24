package com.maj.creational.factorymethod;

/**
 * Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
 * but allows subclasses to alter the type of objects that will be created.
 */
public class Main {
    private static ButtonFactory factory;
    public static void main(String[] args) {
        configure();
        Button button = factory.createButton();
        button.render();
        button.onClick();
    }

    private static void configure() {
        final String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac") || os.contains("win")) {
            factory = new WindowsButtonFactory();
        } else {
            factory = new HtmlButtonFactory();
        }
    }
}
