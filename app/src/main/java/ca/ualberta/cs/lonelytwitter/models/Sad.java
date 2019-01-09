package ca.ualberta.cs.lonelytwitter.models;

import java.util.Date;

public class Sad extends moodObject {
    private String mood = "sad";

    public Sad() {
    }

    public Sad(Date setDate) {
        super(setDate);
    }

    public String getMood() {
        return this.mood;
    }
}
