package org.padilha;

import org.padilha.exception.TemperatureOutOfRangeException;
import org.padilha.input.UserInputTemperature;
import org.padilha.models.Temperature;
import org.padilha.repositories.SongCollectionRepositoryImpl;
import org.padilha.repositories.interfaces.SongCollectionRepository;
import org.padilha.services.MusicRecomendationService;
import org.padilha.services.RadioServiceImpl;

public class Main {
    public static void main(String[] args) throws TemperatureOutOfRangeException {
        SongCollectionRepository songCollectionRepository = new SongCollectionRepositoryImpl();
        RadioServiceImpl radioService = new RadioServiceImpl(songCollectionRepository, new Temperature());
        UserInputTemperature userInputTemperature = new UserInputTemperature();
        MusicRecomendationService musicRecomendationService = new MusicRecomendationService(radioService);

        float temperatureInput = userInputTemperature.getTemperatureInput();

        Temperature temperature = new Temperature();
        temperature.setValue(temperatureInput);
        musicRecomendationService.getSongByTemperature(temperatureInput);

        songCollectionRepository.getSongs();
    }
}
