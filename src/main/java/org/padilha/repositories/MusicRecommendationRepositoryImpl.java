package org.padilha.repositories;

import org.padilha.models.Song;
import org.padilha.services.RadioService;

import java.util.List;

public class MusicRecommendationRepositoryImpl implements RadioService{
    private RadioService radioService;

    public MusicRecommendationRepositoryImpl(RadioService radioService){
        this.radioService = radioService;
    }

    @Override
    public List<Song> getSongByTemperature(float temperature) {
        List<Song> songs = radioService.getSongByTemperature(temperature);
        if (songs.isEmpty()) {
            System.out.println("Não foram encontradas músicas para a temperatura informada.");
        } else {
            System.out.println("Recomendação de música para a temperatura " + temperature + ":");
            for (Song song : songs) {
                System.out.println(song.getTitle() + " - " + song.getArtist() + " - " + song.getGenre());
            }
        }
        return songs;
    }
}


