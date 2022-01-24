package com.maj.structural.proxy.services;

import com.maj.structural.proxy.Video;

import java.util.Date;
import java.util.List;

public class CachedVideosService implements VideosService {
    private final VideosService service;
    private List<Video> cachedVideos;
    private Date cachedUntil;

    public CachedVideosService(VideosService service) {
        this.service = service;
    }

    @Override
    public List<Video> getVideos() {
        final Date now = new Date(System.currentTimeMillis());
        if (cachedVideos == null || cachedUntil.before(now)) {
            cachedVideos = service.getVideos();
            cachedUntil = new Date(now.getTime() +10000);
        }

        return cachedVideos;
    }
}
