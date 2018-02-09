package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Dylan on 2018-01-17.
 */


/**
 * Represents a tweet.
 *
 * @author Dylan
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public class Sad extends Mood {

    /**
     * constructor for sad
     *
     * @param date of sad
     */
    Sad(Date date){
        super(date);
    }

    /**
     * gets the mood
     *
     * @return message of the mood
     */
    public String getMood(){
        return "I'm sad...";
    }

}
