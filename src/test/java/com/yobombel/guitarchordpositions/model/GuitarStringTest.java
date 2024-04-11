package com.yobombel.guitarchordpositions.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GuitarStringTest {

    GuitarString guitarString;
    Note tuning;
    String expectedNotes;
    int fretCount;

    @BeforeEach
    void setup() {
        fretCount = 24;
        tuning = Note.G;
        guitarString = new GuitarString(tuning, fretCount);
        expectedNotes = "[G, Gis, A, Ais, B, C, Cis, D, Dis, E, F, Fis, G, Gis, A, Ais, B, C, Cis, D, Dis, E, F, Fis]";
    }

    @Test
    void shouldCreateFretNotes() {
        //GIVEN
        //WHEN
        String result = guitarString.getFretNotes().toString();

        //THEN
        assertEquals(expectedNotes, result);
    }

    @Test
    void shouldChangeFretNotesAfterTuningChange() {
        //GIVEN
        Note newTuning = Note.C;

        //WHEN
        guitarString.setTuning(newTuning);
        String result = guitarString.getFretNotes().toString();

        //THEN
        assertNotEquals(expectedNotes, result);
    }

    @Test
    void shouldChangeFretNotesAfterFretCountChange(){
        //GIVEN
        int newFretCount = 25;

        //WHEN
        guitarString.setFretCount(newFretCount);
        String result = guitarString.getFretNotes().toString();

        //THEN
        assertNotEquals(expectedNotes, result);
    }

}