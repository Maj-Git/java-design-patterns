package com.maj.behavioral.templatemethod;

public class Main {
    /**
     * Démonstration du pattern template method.
     * Nos fabriques de maison appelleront l'algorithme buildHouse() dont l'étape de construction
     * des murs dépendra de la fabrique.
     */
    public static void main(String[] args) {
        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        HouseBuilder woodHouseBuilder = new WoodHouseBuilder();

        House stoneHouse = stoneHouseBuilder.buildHouse();
        House woodHouse = woodHouseBuilder.buildHouse();
        System.out.println(stoneHouse);
        System.out.println(woodHouse);
    }
}
