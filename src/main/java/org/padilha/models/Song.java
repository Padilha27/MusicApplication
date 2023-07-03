package org.padilha.models;

public class Song {
    private String title;
    private String artist;
    private Genre genre;
    private Temperature temperature;

    public Song(String title, String artist, Genre genre, Temperature temperature) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.temperature = temperature;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public Temperature getTemperature() {
        return temperature;
    }
}
