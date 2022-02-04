package com.maj.behavioral.templatemethod;

/**
 * Classe qui construit des maisons avec des murs en pierre.
 *
 * On pose toujours les mêmes fondations et les mêmes toits.
 *
 * Une sous-classe devra fournir une méthode de construction des murs.
 */
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
