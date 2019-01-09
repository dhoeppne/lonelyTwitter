package ca.ualberta.cs.lonelytwitter.models;

import java.util.Date;

public abstract class moodObject {
    private Date currentDate = new Date();
    private Date date;

    public moodObject() {
        this.date = currentDate;
    }

    public moodObject(Date setDate) {
        this.date = setDate;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date newDate) {
        this.date = newDate;
    }
}