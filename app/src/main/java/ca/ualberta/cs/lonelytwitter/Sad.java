package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Dylan on 2018-01-17.
 */

public class Sad extends Mood {
    Sad(Date date){
        super(date);
    }

    public String getMood(){
        return "I'm sad...";
    }

}
