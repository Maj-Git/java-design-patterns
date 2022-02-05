package com.maj.structural.proxy.services;

import com.maj.structural.proxy.Video;

import java.util.List;

/**
 * Implémentation du service qui récupèrera des vidéos en ligne.
 */
public class HttpVideosService implements VideosService {

    /**
     * On simule la récupération de vidéos en ligne.
     * @return La liste des vidéos.
     */
    @Override
    public List<Video> getVideos() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return List.of(
                new Video("Funny video"),
                new Video("Unother video"),
                new Video("Unother one")
        );
    }
}
