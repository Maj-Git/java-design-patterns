package com.maj.behavioral.strategy.strategies;

public class WalkStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String destination) {
        return "Walking to %s.".formatted(destination);
    }
}
