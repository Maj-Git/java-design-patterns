package com.maj.creational.factorymethod;

/**
 * Une fabrique dont la méthode de création renvoie un bouton HTML.
 */
public class HtmlButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
