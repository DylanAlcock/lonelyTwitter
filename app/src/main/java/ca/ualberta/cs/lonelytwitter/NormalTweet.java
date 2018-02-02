package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Dylan on 2018-01-17.
 */

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author Dylan
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public class NormalTweet extends Tweet {

    /**
     * constructor for normal tweet
     *
     * @param message of the tweet
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * constructor for normal tweet
     *
     * @param message of the tweet
     * @param date of the tweet
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Tells you if the tweet is important
     */
    @Override
    public boolean isImportant(){
        return false;
    }
}

