package com.maj.behavioral.command.commands;

import com.maj.behavioral.command.StockService;

public class BuyCommand extends OrderCommand {

    public BuyCommand(StockService stockService, int quantity) {
        super(stockService, quantity);
    }

    @Override
    public void execute() {
        stockService.buy(quantity);
    }
}
