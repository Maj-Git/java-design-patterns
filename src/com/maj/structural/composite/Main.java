package com.maj.structural.composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(10);
        Product boxedProduct = new Product(3);
        Product boxedProduct2 = new Product(7);
        Box childBox = new Box(List.of(boxedProduct, boxedProduct2));
        Box parentBox = new Box(List.of(product, childBox));

        System.out.printf("Total price: %f $", parentBox.getPrice());
    }
}
