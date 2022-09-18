package ru.nixic.model;

import java.util.Arrays;

public enum Level {

    LEVEL_ONE("levelOne"),
    LEVEL_TWO("levelTwo"),
    LEVEL_THREE("levelThree");

    Level(String code) {
    }

    public static Level getLevelByOrdinalId(Integer id) {
        return Arrays.stream(Level.values())
                .filter(level -> level.ordinal() == id).findFirst().orElse(null);
    }

}
