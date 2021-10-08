package com.example.gamecatalogueservice.sampleData;

import com.example.gamecatalogueservice.VideoGame;
import com.example.gamecatalogueservice.VideoGameRepository;
import com.github.javafaker.Faker;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class SampleDataLoader implements CommandLineRunner {

    @Autowired
    VideoGameRepository videoGameRepository;
    private final Faker faker;

    public SampleDataLoader(Faker faker) {

        this.faker = faker;
    }

    @Override
    public void run(String... args) {

        List<VideoGame> sampleBooks = IntStream.rangeClosed(1, 42)
                .mapToObj(i -> new VideoGame(
                        faker.dragonBall().character(),
                        BigDecimal.valueOf(faker.number().randomDigitNotZero())
                )).collect(Collectors.toList());

        videoGameRepository.saveAll(sampleBooks);

    }
}
