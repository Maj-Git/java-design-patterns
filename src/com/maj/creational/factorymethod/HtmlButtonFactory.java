package com.maj.creational.factorymethod;

public class HtmlButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
