package org.padilha.repositories;

import org.padilha.models.Genre;
import org.padilha.models.Song;
import org.padilha.models.Temperature;

import java.util.ArrayList;
import java.util.List;

public class SongCollectionRepositoryImpl implements SongCollectionRepository{
   private List<Song> songs;

    public SongCollectionRepositoryImpl() {
        this.songs = new ArrayList<>();
        this.songs.add(new Song("Paranoid", "Black Sabbath", Genre.METAL,new Temperature(-50f,-30f)));
        this.songs.add(new Song("One More Time", "Daft Punk", Genre.TECHNO,new Temperature(-30f,-15f)));
        this.songs.add(new Song("Radioactive", "Imagine Dragons", Genre.ROCK,new Temperature(-15f,0f)));
        this.songs.add(new Song("Águas de Março", "Tom Jobim e Elis Regina", Genre.BOSSA_NOVA,new Temperature(0f,15f)));
        this.songs.add(new Song("Moonlight Sonata", "Beethoven", Genre.CLASSICAL_MUSIC,new Temperature(15f,30f)));
        this.songs.add(new Song("Céu de Santo Amaro", "Chitãozinho & Xororó", Genre.COUNTRY,new Temperature(30f,100f)));
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }
}
