package com.maj.behavioral.strategy.strategies;

public class BicycleStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String destination) {
        return "Biking to %s.".formatted(destination);
    }
}
