package com.maj.behavioral.command;

import com.maj.behavioral.command.commands.BuyCommand;
import com.maj.behavioral.command.commands.SellCommand;

public class Main {

    /**
     * Démonstration du pattern Command.
     * Le broker gère une liste de commandes, puis les exécute toutes.
     */
    public static void main(String[] args) {
        StockService stockService = new StockService();
        Broker broker = new Broker();
        broker.takeOrder(new BuyCommand(stockService, 5));
        broker.takeOrder(new SellCommand(stockService, 10));
        broker.placeOrders();
    }
}
