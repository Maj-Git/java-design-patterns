package com.maj.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);

        Circle cloneCircle = (Circle) circle.clone();
        System.out.printf("Clone circle's radius = %d", cloneCircle.getRadius());

    }
}
