package com.yobombel.guitarchordpositions.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuitarString {

    private Note tuning;
    private int fretCount;
    private List<Note> fretNotes;

    public GuitarString(Note tuning, int fretCount) {
        this.tuning = tuning;
        this.fretCount = fretCount;
        this.fretNotes = setFretNotes(tuning, fretCount);

    }

    public Note getTuning() {
        return tuning;
    }

    public int getFretCount() {
        return fretCount;
    }

    public List<Note> getFretNotes() {
        return fretNotes;
    }

    public void setTuning(Note tuning) {
        this.tuning = tuning;
        this.fretNotes = setFretNotes(tuning, this.fretCount);
    }

    public void setFretCount(int fretCount) {
        this.fretCount = fretCount;
        this.fretNotes = setFretNotes(this.tuning, fretCount);
    }

    private List<Note> setFretNotes(Note tuning, int fretCount) {
        List<Note> fretNotesList = new ArrayList<>();
        List<Note> notes = Arrays.stream(Note.values()).toList();
        int tuningIndex = notes.indexOf(tuning);
        Note currentNote;
        int currentFret = 0;

        for (int i = tuningIndex; i < notes.size(); i++) {
            currentNote = notes.get(i);
            fretNotesList.add(currentFret, currentNote);
            currentFret++;

            if (i == notes.size() - 1)
                i = -1;
            if (fretNotesList.size() == fretCount)
                break;
        }

        return fretNotesList;
    }
}