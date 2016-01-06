package com.example.circle.birdapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by circle on 1/5/16.
 */
public class TweetAdapter extends ArrayAdapter{
    private LayoutInflater inflater;

    public TweetAdapter(Activity activity, String[] items) {
        super(activity, R.layout.row_tweet, items);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // What is ViewGroup? How does convertView work?
        return  inflater.inflate(R.layout.row_tweet, parent, false);
    }

}
