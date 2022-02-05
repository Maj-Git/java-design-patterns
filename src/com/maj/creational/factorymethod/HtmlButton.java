package com.maj.creational.factorymethod;

/**
 * Un bouton HTML
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Html Button</button>");
    }

    @Override
    public void onClick() {
        System.out.println("Clicking html button");
    }
}
