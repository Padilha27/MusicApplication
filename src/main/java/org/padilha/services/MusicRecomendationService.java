/*package org.padilha.services;

import org.padilha.exception.TemperatureOutOfRangeException;
import org.padilha.models.Song;

import java.util.List;

public class MusicRecomendationService implements RadioService{
    private RadioService radioService;

    public MusicRecomendationService(RadioServiceImpl radioService) {
        this.radioService = radioService;
    }

    @Override
    public List<Song> getSongByTemperature(float temperature) throws TemperatureOutOfRangeException {
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
*/
//throw new TemperatureOutOfRangeException("Temperatura fora do intervalo permitido.");
/*package org.padilha.services;

import org.padilha.exception.TemperatureOutOfRangeException;
import org.padilha.models.Song;

import java.util.List;

public class MusicRecomendationService implements RadioService {
    private RadioService radioService;

    public MusicRecomendationService(RadioServiceImpl radioService) {
        this.radioService = radioService;
    }

    @Override
    public List<Song> getSongByTemperature(float temperature) throws TemperatureOutOfRangeException {
        try {
            List<Song> songs = radioService.getSongByTemperature(temperature);
            if (songs.isEmpty()) {
                throw new TemperatureOutOfRangeException("Não foram encontradas músicas para a temperatura informada.");
            } else {
                System.out.println("Recomendação de música para a temperatura " + temperature + ":");
                for (Song song : songs) {
                    System.out.println(song.getTitle() + " - " + song.getArtist() + " - " + song.getGenre());
                }
            }
            return songs;
        } catch (IllegalArgumentException e) {
            throw new TemperatureOutOfRangeException("Temperature is outside the valid range.", e);
        }
    }
}
*/
package org.padilha.services;

import org.padilha.exception.TemperatureOutOfRangeException;
import org.padilha.input.UserInputTemperature;
import org.padilha.models.Song;
import org.padilha.services.interfaces.RadioService;

import java.util.List;

public class MusicRecomendationService implements RadioService {
    private RadioService radioService;

    public MusicRecomendationService(RadioService radioService) {
        this.radioService = radioService;
    }

    @Override
    public List<Song> getSongByTemperature(float temperatureInput) throws TemperatureOutOfRangeException {
        List<Song> songs = radioService.getSongByTemperature(temperatureInput);
        System.out.println("Sua recomendação de música para a temperatura " + temperatureInput + ":");
        for (Song song : songs) {
            System.out.println(song.getTitle() + " - " + song.getArtist() + " - " + song.getGenre());
        }
        return songs;
    }
}

