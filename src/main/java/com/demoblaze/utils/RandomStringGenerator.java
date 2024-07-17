package com.demoblaze.utils;

import java.util.Random;

public class RandomStringGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int length) {
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        int charactersLength = CHARACTERS.length();

        for (int i = 0; i < length; i++) {
            result.append(CHARACTERS.charAt(random.nextInt(charactersLength)));
        }

        return result.toString();
    }
}