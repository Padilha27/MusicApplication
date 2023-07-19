package org.padilha.models;

/*public class Song {
    private String title;
    private Temperature songTemperature;

    public Song(String title,Temperature songTemperature) {
        this.title = title;
        this.songTemperature = songTemperature;
    }

    public String getTitle() {
        return title;
    }
    public Temperature getSongTemperature() {
        return songTemperature;
    }
}*/

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

    public Temperature getSongTemperature() {
        return temperature;
    }
}