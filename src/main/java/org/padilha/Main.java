package org.padilha;

import org.padilha.input.InputTemperature;
import org.padilha.repositories.MusicRecommendationRepositoryImpl;
import org.padilha.repositories.SongCollectionRepositoryImpl;
import org.padilha.services.RadioServiceImpl;

public class Main {
    public static void main(String[] args) {
        SongCollectionRepositoryImpl songCollectionRepositoryImpl = new SongCollectionRepositoryImpl();
        RadioServiceImpl radioService = new RadioServiceImpl(songCollectionRepositoryImpl);
        InputTemperature inputTemperature = new InputTemperature();
        MusicRecommendationRepositoryImpl musicRecommendationRepository = new MusicRecommendationRepositoryImpl(radioService);

        float temperature = inputTemperature.getTemperatureInput();

        musicRecommendationRepository.getSongByTemperature(temperature);
    }
}
