package com.maj.behavioral.strategy.strategies;

/**
 * Implémentation de la stratégie pour naviguer par la route.
 */
public class RoadStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String destination) {
        return "Going to %s by road.".formatted(destination) ;
    }
}
