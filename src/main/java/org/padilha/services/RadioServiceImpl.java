package org.padilha.services;

import org.padilha.models.Song;
import org.padilha.repositories.SongCollectionRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class RadioServiceImpl implements RadioService {
    private final SongCollectionRepositoryImpl songCollectionRepositoryImpl;

    public RadioServiceImpl(SongCollectionRepositoryImpl songCollectionRepositoryImpl) {
        this.songCollectionRepositoryImpl = songCollectionRepositoryImpl;
    }

    @Override
    public List<Song> getSongByTemperature(float temperature) {
        return songCollectionRepositoryImpl.getSongs().stream()
                .filter(song -> song.getTemperature()
                        .isTemperatureInRange(temperature))
                .collect(Collectors.toList());
    }
}