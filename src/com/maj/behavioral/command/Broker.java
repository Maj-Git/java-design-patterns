package com.maj.behavioral.command;

import com.maj.behavioral.command.commands.OrderCommand;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private final List<OrderCommand> orders = new ArrayList<>();

    public void takeOrder(OrderCommand order) {
        orders.add(order);
    }

    public void placeOrders() {
        orders.forEach(OrderCommand::execute);
    }

}
