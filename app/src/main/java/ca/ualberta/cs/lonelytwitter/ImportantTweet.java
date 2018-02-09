package ca.ualberta.cs.lonelytwitter;



import java.util.Date;

/**
 * Represents an important tweet.
 *
 * @author Dylan
 * @version 1.5
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * constructor for an important tweet
     *
     * @param message tweet message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * constructor for an important tweet
     *
     * @param message tweet message
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * gets the tweet message
     *
     * @return message the tweet has
     */
    public String getMessage(){
        return "hi";
    }

    /**
     * shows if tweet is important
     *
     * @return boolean whether the tweet is important or not
     */
    @Override
    public boolean isImportant(){
        return true;
    }
}
