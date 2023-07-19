package org.padilha.repositories.interfaces;

import org.padilha.models.Song;

import java.util.List;

public interface SongCollectionRepository {
    List<Song> getSongs();
}
