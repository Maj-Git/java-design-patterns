package com.maj.behavioral.command.commands;

import com.maj.behavioral.command.StockService;

public class SellCommand extends OrderCommand {

    public SellCommand(StockService stockService, int quantity) {
        super(stockService, quantity);
    }

    @Override
    public void execute() {
        stockService.sell(quantity);
    }
}
