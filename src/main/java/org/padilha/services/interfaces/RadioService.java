package org.padilha.services.interfaces;

import org.padilha.exception.TemperatureOutOfRangeException;
import org.padilha.models.Song;

import java.util.List;

public interface RadioService {
    List<Song> getSongByTemperature(float temperature) throws TemperatureOutOfRangeException;
}
