package ru.nixic.model;

import java.util.Arrays;

public enum Level {

    LEVEL_ONE("levelOne"),
    LEVEL_TWO("levelTwo"),
    LEVEL_THREE("levelThree");

    private String id;
    private String code;

    Level(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public static Level getLevelByOrdinalId(Integer id) {
        return Arrays.stream(Level.values())
                .filter(level -> level.ordinal() == id).findFirst().orElse(null);
    }

}
