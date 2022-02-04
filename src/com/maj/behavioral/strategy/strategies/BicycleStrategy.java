package com.maj.behavioral.strategy.strategies;

/**
 * Implémentation de la stratégie pour naviguer par voie cyclable.
 */
public class BicycleStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String destination) {
        return "Biking to %s.".formatted(destination);
    }
}
