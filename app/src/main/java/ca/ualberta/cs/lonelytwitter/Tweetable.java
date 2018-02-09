package ca.ualberta.cs.lonelytwitter;


/**
 * Interface for a tweet.
 *
 * @author Dylan
 * @version 1.5
 */
public interface Tweetable {

    /**
     * get the string message
     */
    public String getMessage();

    /**
     * set the message for a tweet
     *
     * @param message
     * @throws TweetTooLongException thrown if tweet to long
     */
    public void setMessage(String message) throws TweetTooLongException;

}
