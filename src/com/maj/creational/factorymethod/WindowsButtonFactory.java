package com.maj.creational.factorymethod;

/**
 * Une fabrique dont la méthode de création renvoie un bouton pour Windows.
 */
public class WindowsButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
