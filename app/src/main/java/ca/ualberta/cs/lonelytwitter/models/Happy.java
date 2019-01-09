package ca.ualberta.cs.lonelytwitter.models;

import java.util.Date;

public class Happy extends moodObject {
    private String mood = "happy";

    public Happy() {
    }

    public Happy(Date setDate) {
        super(setDate);
    }

    public String getMood() {

        return this.mood;
    }
}
