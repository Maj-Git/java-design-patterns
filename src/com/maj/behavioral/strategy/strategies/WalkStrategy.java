package com.maj.behavioral.strategy.strategies;

/**
 * Implémentation de la stratégie pour naviguer à pied.
 */
public class WalkStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String destination) {
        return "Walking to %s.".formatted(destination);
    }
}
