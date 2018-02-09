package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author Dylan
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public class Happy extends Mood {


    /**
     * sets the date
     *
     * @param date
     */
    Happy(Date date){
        super(date);
    }

    /**
     * gets the mood
     *
     * @return the mood
     */
    public String getMood(){
        return "I'm Happy!";
    }

}

