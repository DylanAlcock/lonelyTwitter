package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Dylan on 2018-01-17.
 */

public abstract class Mood {
    private Date date;
    private String mood;

    public Mood(){
        this.date = new Date();
        this.mood = "No mood";
    }

    public Mood(Date date){
        this.date = date;
        this.mood = "No mood";
    }

    public Date getDate(){
        return date;
    }

    public String getMood(){
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setDate(Date date){
        this.date = date;
    }

}
