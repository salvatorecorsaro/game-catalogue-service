package com.example.gamecatalogueservice;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class VideoGameService {

    @Autowired
    VideoGameRepository videoGameRepository;

    @Autowired
    Faker faker;

    public VideoGame getRandom() {
        return new VideoGame(
                faker.dragonBall().character(),
                BigDecimal.valueOf(faker.number().randomDigitNotZero()));
    }

    public List<VideoGame> getAllVideoGames() {
        return videoGameRepository.findAll(Sort.by("name"));
    }

    public VideoGame createNewVideoGame(VideoGame newVideoGame) {
        return videoGameRepository.save(newVideoGame);
    }
}
