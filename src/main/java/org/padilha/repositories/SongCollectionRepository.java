package org.padilha.repositories;

import org.padilha.models.Song;

import java.util.List;

public interface SongCollectionRepository {
    List<Song> getSongs();
}
