package org.example.models;

public class Song {
   private String title;
   private String artist;
   private Genre genre;
   private Float minTemperature;
   private Float maxTemperature;

    public Song(String title, String artist, Genre genre, Float minTemperature, Float maxTemperature) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public boolean isTemperatureInRange(Float temperature) {
        if (minTemperature == -50f && maxTemperature == -30f){
            return temperature >= minTemperature && temperature <= maxTemperature;
        }
        else if (minTemperature == -30f && maxTemperature == -15f) {
            return temperature >= minTemperature && temperature <= maxTemperature;
        }
        else if (minTemperature == -15f && maxTemperature == 0f) {
            return temperature >= minTemperature && temperature <= maxTemperature;
        }
        else if (minTemperature == 0f && maxTemperature == 15f) {
            return temperature >= minTemperature && temperature <= maxTemperature;
        }
        else if (minTemperature == 15f && maxTemperature == 30f) {
            return temperature >= minTemperature && temperature <= maxTemperature;
        }
        else if (minTemperature == 30f && maxTemperature == 100f) {
            return temperature >= minTemperature && temperature <= maxTemperature;
        } else {
          return  false;
        }
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getGenre(){
        return genre.name;
    }
}
