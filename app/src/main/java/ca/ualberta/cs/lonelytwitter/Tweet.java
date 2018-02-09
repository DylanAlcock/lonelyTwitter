/*
 * Tweet
 *
 * January 31, 2018
 *
 * Copyright (c) 2018 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license on this project, Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;


/**
 * Represents a tweet.
 *
 * @author Dylan
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;
    ArrayList<Mood> allmoods = new ArrayList<Mood>();

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message =  message;
        this.date = date;
    }

    /**
     * Gets the date of the tweet
     *
     * @return the date of the tweet
     */
    public Date getDate(){
        return date;
    }

    /**
     * Get the message of a tweet.
     *
     * @return returns the message of the tweet
     */
    public String getMessage(){
        return message;

    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException thrown if tweet exceeds 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Sets tweet date.
     *
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Tells you if the tweet is important
     */
    public abstract boolean isImportant();
}
