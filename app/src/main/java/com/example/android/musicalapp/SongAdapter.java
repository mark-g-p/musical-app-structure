package com.example.android.musicalapp;


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


import com.example.android.musicalapp.databinding.LibraryItemBinding;

import java.util.ArrayList;

/**
 *
 */

class SongAdapter extends ArrayAdapter<Song> {

    SongAdapter(Activity context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @Override
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        LibraryItemBinding binding;
        if (listItemView == null) {
            binding = DataBindingUtil.inflate(
                    LayoutInflater.from(getContext()),
                    R.layout.library_item, parent, false);
            listItemView = binding.getRoot();
        } else {
            binding = (LibraryItemBinding) listItemView.getTag();
        }
        binding.coverImage.setImageResource(this.getItem(position).getCoverImageId());
        binding.author.setText(this.getItem(position).getSongArtist());
        binding.songName.setText(this.getItem(position).getSongName());
        listItemView.setTag(binding);
        return listItemView;

    }
}
