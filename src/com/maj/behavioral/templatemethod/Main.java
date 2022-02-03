package com.maj.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        HouseBuilder woodHouseBuilder = new WoodHouseBuilder();

        House stoneHouse = stoneHouseBuilder.buildHouse();
        House woodHouse = woodHouseBuilder.buildHouse();
        System.out.println(stoneHouse);
        System.out.println(woodHouse);
    }
}
