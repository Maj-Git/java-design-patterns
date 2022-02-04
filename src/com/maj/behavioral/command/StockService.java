package com.maj.behavioral.command;

/**
 * Un service qui permet d'acheter ou de vendre une certaine quantité d'un produit du stock.
 */
public class StockService {
    public void buy(int quantity) {
        System.out.printf("Buying %d items", quantity);
    }

    public void sell(int quantity) {
        System.out.printf("Selling %d items", quantity);
    }
}
