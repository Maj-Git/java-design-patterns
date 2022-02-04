package com.maj.behavioral.strategy;

import com.maj.behavioral.strategy.strategies.RoadStrategy;

public class Main {
    /**
     * Démonstration du pattern Strategy.
     *
     * On crée un navigateur auquel on fournit la stratégie de notre choix, et le navigateur utilisera
     * cette stratégie pour construire la route pour naviguer vers la destination.
     */
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new RoadStrategy());
        System.out.println(navigator.buildRoute("United States"));
    }
}
