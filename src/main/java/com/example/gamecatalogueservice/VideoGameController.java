package com.example.gameclientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videogames")
public class VideoGameController {

    @Autowired
    VideoGameService videoGameService;

    @GetMapping("/random")
    VideoGame randomGame(){
        return videoGameService.getRandom();
    }


    @GetMapping
    List<VideoGame> getAllVideoGames(){
        return videoGameService.getAllVideoGames();
    }

    @PostMapping
    VideoGame createNewVideoGame(@RequestBody VideoGame newVideoGame){
        return videoGameService.createNewVideoGame(newVideoGame);
    }
}
