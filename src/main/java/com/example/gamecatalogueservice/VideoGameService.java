package com.example.gameclientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameService {

    @Autowired
    VideoGameCatalogueProxy videoGameCatalogueProxy;

    public VideoGame getRandom() {
        return videoGameCatalogueProxy.getRandom();
    }

    public List<VideoGame> getAllVideoGames() {
        return videoGameCatalogueProxy.getAllVideoGames();
    }

    public VideoGame createNewVideoGame(VideoGame newVideoGame) {
        return videoGameCatalogueProxy.createNewVideoGame(newVideoGame);
    }
}
