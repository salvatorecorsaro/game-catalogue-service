package com.example.gamecatalogueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GameCatalogueServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameCatalogueServiceApplication.class, args);
    }

}
