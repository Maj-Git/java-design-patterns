package com.maj.behavioral.command.commands;

import com.maj.behavioral.command.StockService;

/**
 * Commande pour vendre une quantité d'un produit du stock.
 */
public class SellCommand implements OrderCommand {
    private final StockService stockService;
    private final int quantity;

    public SellCommand(StockService stockService, int quantity) {
        this.stockService = stockService;
        this.quantity = quantity;
    }
    @Override
    public void execute() {
        stockService.sell(quantity);
    }
}
