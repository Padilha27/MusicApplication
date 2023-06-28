package org.example.repositories;

import org.example.models.Genre;
import org.example.models.Song;

import java.util.ArrayList;
import java.util.List;

public class SongCollection {
   private List<Song> songs;

    public SongCollection() {
        this.songs = new ArrayList<>();
        this.songs.add(new Song("Paranoid", "Black Sabbath", Genre.METAL,-50f,-30f));
        this.songs.add(new Song("One More Time", "Daft Punk", Genre.TECHNO,-30f,-15f));
        this.songs.add(new Song("Radioactive", "Imagine Dragons", Genre.ROCK,-15f,0f));
        this.songs.add(new Song("Águas de Março", "Tom Jobim e Elis Regina", Genre.BOSSA_NOVA,0f,15f));
        this.songs.add(new Song("Moonlight Sonata", "Beethoven", Genre.CLASSICAL_MUSIC,15f,30f));
        this.songs.add(new Song("Céu de Santo Amaro", "Chitãozinho & Xororó", Genre.COUNTRY,30f,100f));
        //implementar outras musicas aqui conforme modelo acima!!
    }

    public List<Song> getSongs() {
        return songs;
    }
}
