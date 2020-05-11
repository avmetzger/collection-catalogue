package org.launchcode.collectioncatalogue.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Art extends AbstractEntity{

    @NotNull
    private String nameInGame;

    @NotNull
    private String title;

    @NotNull
    private String artist;

    @NotNull
    private String photo;

    public Art() {
    }

    public Art(@NotNull String nameInGame, @NotNull String title, @NotNull String artist, @NotNull String photo) {
        this.nameInGame = nameInGame;
        this.title = title;
        this.artist = artist;
        this.photo = photo;
    }

    public String getNameInGame() {
        return nameInGame;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getPhoto() {
        return photo;
    }
}
