package com.example.circle.birdapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class TweetListActivity extends Activity {
    private ListView tweetListView;
    private ArrayAdapter tweetItemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_list);

        tweetItemArrayAdapter = new TweetAdapter(this, new String[10]);
        tweetListView = (ListView) findViewById(R.id.list);
        tweetListView.setAdapter(tweetItemArrayAdapter);
    }

    // @Overide --> how does it work?
    // @Override
    protected void onListItemClick (ListView l, View v, int position, long id) {
        // ListView? position?
        Intent intent = new Intent(this, TweetDetailActivity.class);
        startActivity(intent);
    }
}
