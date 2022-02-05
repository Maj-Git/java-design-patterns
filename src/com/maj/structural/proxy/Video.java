package com.maj.structural.proxy;

/**
 * POJO d'une vidéo.
 */
public class Video {
    private final String name;

    public Video(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
