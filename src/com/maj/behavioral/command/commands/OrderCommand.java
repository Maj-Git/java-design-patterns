package com.maj.behavioral.command.commands;

import com.maj.behavioral.command.StockService;

public abstract class OrderCommand {
    protected final StockService stockService;
    protected final int quantity;

    protected OrderCommand(StockService stockService, int quantity) {
        this.stockService = stockService;
        this.quantity = quantity;
    }

    public abstract void execute();
}
