package com.maj.structural.proxy.services;

import com.maj.structural.proxy.Video;

import java.util.List;

public class HttpVideosService implements VideosService {
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
