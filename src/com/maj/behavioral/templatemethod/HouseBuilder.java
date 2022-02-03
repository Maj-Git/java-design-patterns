package com.maj.behavioral.templatemethod;

public abstract class HouseBuilder {
    protected House house;

    public final House buildHouse() {
        house = new House();
        buildFoundation();
        buildWalls();
        buildRoof();
        return house;
    }

    /**
     * Pose les fondations de la maison, toujours les mêmes.
     */
    private void buildFoundation() {
        if (house != null) {
            house.setFoundation("Standard foundation");
        }
    }

    /**
     * Pose le toit de la maison, toujours le même.
     */
    private void buildRoof() {
        if (house != null) {
            house.setRoof("Standard tile roof");
        }
    }
    protected abstract void buildWalls();
}
