package com.maj.behavioral.strategy;

import com.maj.behavioral.strategy.strategies.RoadStrategy;

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
