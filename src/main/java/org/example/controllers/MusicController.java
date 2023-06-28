package org.example.controllers;

import org.example.models.Song;
import org.example.repositories.SongCollection;
import org.example.services.RadioService;

import java.util.List;
import java.util.Scanner;

public class MusicController {
    private final RadioService radioService;

    public MusicController() {
        SongCollection songCollection = new SongCollection();
        this.radioService = new RadioService(songCollection);
    }
    public void getSongByTemperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua temperatura: ");
        float temperature = scanner.nextFloat();

        scanner.nextLine(); // Limpar o buffer

        List<Song> songs = radioService.getSongByTemperature((temperature));
        if (songs.isEmpty()) {
            System.out.println("Não foram encontradas músicas para a temperatura informada.");
        } else {
            System.out.println("Recomendação de música para a temperatura " + temperature + ":");
            for (Song song : songs) {
                System.out.println(song.getTitle() + " - " + song.getArtist() + " - " + song.getGenre());
            }
        }
    }
}
