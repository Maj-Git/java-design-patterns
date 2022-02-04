package com.maj.behavioral.strategy;

import com.maj.behavioral.strategy.strategies.RoadStrategy;

/**
 * Le navigateur ne fait qu'utiliser la stratégie que le client lui fournira pour naviguer.
 */
public class Navigator {
    private final RoadStrategy roadStrategy;

    public Navigator(RoadStrategy roadStrategy) {
        if (roadStrategy == null)
            throw new IllegalArgumentException("Strategy is null.");

        this.roadStrategy = roadStrategy;
    }

    String buildRoute(String destination) {
        return roadStrategy.buildRoute(destination);
    }
}
