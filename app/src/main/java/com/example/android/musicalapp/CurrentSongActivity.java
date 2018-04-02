package com.example.android.musicalapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.musicalapp.databinding.ActivityCurrentSongBinding;


public class CurrentSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);
        ActivityCurrentSongBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_current_song);
        Bundle song = getIntent().getExtras();
        if (song != null) {
            String author = song.getString("author");
            String title = song.getString("title");
            binding.author.setText(author);
            binding.songName.setText(title);
        }
    }
}
