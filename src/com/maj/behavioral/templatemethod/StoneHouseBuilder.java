package com.maj.behavioral.templatemethod;

public class StoneHouseBuilder extends HouseBuilder {
    /**
     * Pose des murs en pierre autour de la maison.
     */
    @Override
    protected void buildWalls() {
        if (house != null) {
            house.setWalls("Stone walls");
        }
    }
}
