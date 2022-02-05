package com.maj.structural.proxy.services;

import com.maj.structural.proxy.Video;

import java.util.Date;
import java.util.List;

/**
 * Implémentation de notre proxy qui implémente VideosService et wrappe un autre VideosService.
 */
public class CachedVideosService implements VideosService {
    private final VideosService service;
    private List<Video> cachedVideos;
    private Date cachedUntil;

    public CachedVideosService(VideosService service) {
        this.service = service;
    }

    /**
     * On récupère les vidéos via le service wrappé et on les met en cache.
     *
     * Tant que le cache est valide, on retourne directement les vidéos cachées, s'économisant donc
     * un appel HTTP.
     * @return La liste des vidéos depuis le cache.
     */
    @Override
    public List<Video> getVideos() {
        final Date now = new Date(System.currentTimeMillis());

        if (cachedVideos == null || cachedUntil.before(now)) {
            System.out.println("Cache vide ou invalide");
            cachedVideos = service.getVideos();
            cachedUntil = new Date(now.getTime() + 10000);
        } else { // Pour l'exemple ...
            System.out.println("Les vidéos sont en cache.");
        }

        return cachedVideos;
    }
}
