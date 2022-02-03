package com.maj.behavioral.templatemethod;

public class WoodHouseBuilder extends HouseBuilder {
    /**
     * Pose des murs en bois autour de la maison.
     */
    @Override
    protected void buildWalls() {
        if (house != null) {
            house.setWalls("Wood walls");
        }
    }
}
