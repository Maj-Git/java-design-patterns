package com.maj.creational.factorymethod;

public class Main {
    private static ButtonFactory factory;

    /**
     * Démonstration du pattern Factory Method.
     *
     * On instancie la bonne fabrique de bouton selon l'OS, et on récupère un nouveau bouton en
     * appelant la méthode de création de bouton de l'interface commune ButtonFactory.
     */
    public static void main(String[] args) {
        configure();
        Button button = factory.createButton();
        button.render();
        button.onClick();
    }

    private static void configure() {
        final String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            factory = new WindowsButtonFactory();
        } else {
            factory = new HtmlButtonFactory();
        }
    }
}
