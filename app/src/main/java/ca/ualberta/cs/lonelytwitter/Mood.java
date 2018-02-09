package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author Dylan
 * @version 1.5
 * @see Sad
 * @see Happy
 */
public abstract class Mood {
    private Date date;
    private String mood;

    /**
     * Constructor for the mood
     */
    public Mood(){
        this.date = new Date();
        this.mood = "No mood";
    }

    /**
     * Constructor for the mood
     * @param date current date
     */
    public Mood(Date date){
        this.date = date;
        this.mood = "No mood";
    }

    /**
     * gets the date of the mood
     *
     * @return mood date
     */
    public Date getDate(){
        return date;
    }

    /**
     * gets the mood
     *
     * @return mood
     */
    public String getMood(){
        return mood;
    }

    /**
     * sets the mood
     *
     * @param mood happy or sad
     */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
     * sets the date
     *
     * @param date of the mood
     */
    public void setDate(Date date){
        this.date = date;
    }

}
