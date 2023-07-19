package org.padilha.models;

public class Album {
    private Artist artist;
    private Genre genres;
    private Song song;
    private Temperature temperature;

    public Album(Artist artist, Genre genres, Song song, Temperature temperature) {
        this.artist = artist;
        this.genres = genres;
        this.song = song;
        this.temperature = temperature;
    }

    public Song getSong() {
        return song;
    }
    public Artist getSongArtist(){
        return artist;
    }
    public Genre getGenres(){
        return genres;
    }
    public Temperature getTemperature(){
        return temperature;
    }
}
