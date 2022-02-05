package com.maj.structural.proxy.services;

import com.maj.structural.proxy.Video;

import java.util.List;

/**
 * Interface pour un service qui fournit des vidéos
 */
public interface VideosService {
    List<Video> getVideos();
}
