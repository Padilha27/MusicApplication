package org.padilha.models;

public enum Artist {
        BLACK_SABBATH("Black Sabbath"),
        DAFT_PUNK("Daft Punk"),
        IMAGINE_DRAGONS("Imagine Dragons"),
        ELIS_REGINA("Elis Regina"),
        BEETHOVEN("Beethoven"),
        XITAOZINHO_E_XORORO("Xitaozinho e Xororo");

    private String name;

    Artist(String name) {
        this.name = name;
    }
}
