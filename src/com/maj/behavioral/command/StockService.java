package com.maj.behavioral.command;

public class StockService {
    public void buy(int quantity) {
        System.out.printf("Buying %d items", quantity);
    }

    public void sell(int quantity) {
        System.out.printf("Selling %d items", quantity);
    }
}
