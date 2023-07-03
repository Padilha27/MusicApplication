package org.padilha.services;

import org.padilha.models.Song;

import java.util.List;

public interface RadioService {
    List<Song> getSongByTemperature(float temperature);
}
