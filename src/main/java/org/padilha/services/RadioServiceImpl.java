/*package org.padilha.services;

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
}*/
//throw new TemperatureOutOfRangeException("Temperatura fora do intervalo permitido.");

package org.padilha.services;

import org.padilha.exception.TemperatureOutOfRangeException;
import org.padilha.models.Song;
import org.padilha.models.Temperature;
import org.padilha.repositories.interfaces.SongCollectionRepository;
import org.padilha.services.interfaces.RadioService;

import java.util.List;
import java.util.stream.Collectors;

public class RadioServiceImpl implements RadioService {
    private final SongCollectionRepository songCollectionRepository;
    private Temperature radioServiceTemperature;

    public RadioServiceImpl(SongCollectionRepository songCollectionRepository, Temperature radioServiceTemperature) {
        this.songCollectionRepository = songCollectionRepository;
        this.radioServiceTemperature = radioServiceTemperature;

    }

    @Override
    public List<Song> getSongByTemperature(float temperatureInput) {
        return songCollectionRepository.getSongs().stream()
                .filter(song -> song.getSongTemperature()
                        .isTemperatureInSongRange(temperatureInput))
                .collect(Collectors.toList());
    }

}

