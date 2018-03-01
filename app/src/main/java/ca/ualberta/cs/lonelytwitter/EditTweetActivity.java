package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

import org.w3c.dom.Text;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class EditTweetActivity extends Activity {

    TextView textView = (TextView)findViewById(R.id.textView);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Bundle bundle = getIntent().getExtras();
        Gson gson = new Gson();
        Tweet input = gson.fromJson(bundle.getString("TweetList"), Tweet.class);
        textView.setText(input.getMessage());
    }
}