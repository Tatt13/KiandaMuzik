package models;

/**
 * Created by Edson on 13/12/2017.
 */

public class Track {
    private int id;
    private String aPath;
    private String aName;
    private Album album;
    private Artist artist;
    private int trackCover;

    public Track(int id) {
        this.id = id;
    }

    public Track() {

    }
    public Track(int id, String aPath, String aName, Album album, Artist artist, int trackCover) {
        this.id = id;
        this.aPath = aPath;
        this.aName = aName;
        this.album = album;
        this.artist = artist;
        this.trackCover = trackCover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getaPath() {
        return aPath;
    }

    public void setaPath(String aPath) {
        this.aPath = aPath;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getTrackCover() {
        return trackCover;
    }

    public void setTrackCover(int trackCover) {
        this.trackCover = trackCover;
    }
}
