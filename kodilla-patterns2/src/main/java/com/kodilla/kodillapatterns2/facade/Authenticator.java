package com.kodilla.kodillapatterns2.facade;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {
    public boolean isAutenticated ( Long userTd) {
        Random random = new Random();
        return random.nextBoolean();

    }
}
