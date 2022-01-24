package com.maj.structural.proxy;

import com.maj.structural.proxy.services.CachedVideosService;
import com.maj.structural.proxy.services.HttpVideosService;
import com.maj.structural.proxy.services.VideosService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        VideosService videosService = new CachedVideosService(new HttpVideosService());
        List<Video> videos = videosService.getVideos();
        videos.forEach(video -> System.out.printf("Video: %s%n", video.getName()));

        List<Video> cachedVideos = videosService.getVideos();
        cachedVideos.forEach(video -> System.out.printf("CachedVideo: %s%n", video.getName()));
    }
}
