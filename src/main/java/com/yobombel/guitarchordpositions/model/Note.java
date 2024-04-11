package com.yobombel.guitarchordpositions.model;

public enum Note {

    A ("A"),
    Ais ("A#"),
    B("B"),
    C("C"),
    Cis("C#"),
    D("D"),
    Dis("D#"),
    E("E"),
    F("F"),
    Fis("F#"),
    G("G"),
    Gis("G#");

    private final String name;

    Note(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
