package com.maj.creational.factorymethod;

/**
 * Un bouton pour Windows.
 */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicking windows button");
    }
}
