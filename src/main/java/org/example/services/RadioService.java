package org.example.services;

import org.example.models.Song;
import org.example.repositories.SongCollection;

import java.util.List;
import java.util.stream.Collectors;

public class RadioService {
    private final SongCollection songCollection;

    public RadioService(SongCollection songCollection) {
        this.songCollection = songCollection;
    }

    public List<Song> getSongByTemperature(Float temperature){
        return songCollection.getSongs().stream()
                .filter(song -> song.isTemperatureInRange(temperature))
                .collect(Collectors.toList());
    }
}
