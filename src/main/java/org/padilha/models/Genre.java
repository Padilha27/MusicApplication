package org.padilha.models;

public enum Genre {
    METAL("Metal"),
    TECHNO("Techno"),
    ROCK("Rock"),
    BOSSA_NOVA("Bossa Nova"),
    CLASSICAL_MUSIC("Música Clássica"),
    COUNTRY("Sertanejo");

    String name;

    Genre(String name) {
        this.name = name;
    }
}
