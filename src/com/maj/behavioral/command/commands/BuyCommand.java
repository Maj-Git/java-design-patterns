package com.maj.behavioral.command.commands;

import com.maj.behavioral.command.StockService;

/**
 * Commande pour acheter une quantité d'un produit du stock.
 */
public class BuyCommand implements OrderCommand {
    private final StockService stockService;
    private final int quantity;

    public BuyCommand(StockService stockService, int quantity) {
        this.stockService = stockService;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        stockService.buy(quantity);
    }
}
