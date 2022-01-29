package com.maj.behavioral.strategy;

import com.maj.behavioral.strategy.strategies.RoadStrategy;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new RoadStrategy());
        System.out.println(navigator.buildRoute("United States"));
    }
}
