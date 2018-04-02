package com.example.android.musicalapp;

class Song {

    private String songArtist;
    private String songName;
    private int coverImageId;

    /**
     * Create a new Song object.
     *
     * @param songArtist is the songs artist.
     * @param songName   is the title of song.
     * @param imageId    is the id of a cover image
     */
    Song(String songArtist, String songName, int imageId) {
        this.songArtist = songArtist;
        this.songName = songName;
        this.coverImageId = imageId;
    }
//    Getters
    String getSongArtist() {
        return songArtist;
    }
    String getSongName() {
        return songName;
    }
    int getCoverImageId() {
        return coverImageId;
    }
}
