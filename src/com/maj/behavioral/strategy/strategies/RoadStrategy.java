package com.maj.behavioral.strategy.strategies;

public class RoadStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String destination) {
        return "Going to %s by road.".formatted(destination) ;
    }
}
