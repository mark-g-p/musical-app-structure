package com.example.android.musicalapp;

class Song {

    private final String songArtist;
    private final String songName;
    private final int coverImageId;

    /**
     * Create a new Song object.
     *
     * @param songArtist is the songs artist.
     * @param songName   is the title of song.
     * @param coverImageId    is the id of a cover image
     */
    Song(String songArtist, String songName, int coverImageId) {
        this.songArtist = songArtist;
        this.songName = songName;
        this.coverImageId = coverImageId;
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
