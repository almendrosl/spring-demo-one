package com.luv2code.springdemo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {

    private final String[] fortunes = {"Bad fortune", "Good fortune", "Meh Fortune"};

    @Override
    public String getFortune() {
        int randomNumber = ThreadLocalRandom.current().nextInt(fortunes.length);
        return fortunes[randomNumber];
    }
}
