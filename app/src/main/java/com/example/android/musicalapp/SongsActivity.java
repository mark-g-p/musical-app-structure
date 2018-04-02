/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicalapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.example.android.musicalapp.databinding.ActivitySongsListBinding;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);
        ActivitySongsListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_songs_list);

        // Create a list of words
        ArrayList<Song> songsList = new ArrayList<>();
        songsList.add(new Song("Artist1", "Song1",
                R.drawable.generic_small));
        songsList.add(new Song("Artist1", "Song2",
                R.drawable.generic_small));
        songsList.add(new Song("Artist2", "Song4",
                R.drawable.generic_small));
        songsList.add(new Song("Artist3", "Song3",
                R.drawable.generic_small));
        songsList.add(new Song("Artist1", "Song5",
                R.drawable.generic_small));
        songsList.add(new Song("Artist5", "Song12",
                R.drawable.generic_small));
        songsList.add(new Song("Artist6", "Song17",
                R.drawable.generic_small));

        SongAdapter adapter =
                new SongAdapter(this, songsList);

        binding.list.setAdapter(adapter);
        binding.list.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songsIntent = new Intent(SongsActivity.this, CurrentSongActivity.class);
                Song song = (Song) parent.getItemAtPosition(position);
                songsIntent.putExtra("title", song.getSongName());
                songsIntent.putExtra("author", song.getSongArtist());
                startActivity(songsIntent);
            }
        });
    }
}
