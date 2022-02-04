package com.maj.behavioral.strategy.strategies;

/**
 * Interface pour une stratégie qui permet de construire une route pour aller vers une destination.
 */
public interface RouteStrategy {
    String buildRoute(String destination);
}
