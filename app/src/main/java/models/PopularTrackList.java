package models;

import java.util.ArrayList;

/**
 * Created by Edson on 19/12/2017.
 */

public class PopularTrackList {

    private int trackListId;
    private int artistId;
    private ArrayList<Track> popularTracks;

    public PopularTrackList(int trackListId, int artistId, ArrayList<Track> popularTracks) {
        this.trackListId = trackListId;
        this.artistId = artistId;
        this.popularTracks = popularTracks;
    }

    public int getTrackListId() {
        return trackListId;
    }

    public void setTrackListId(int trackListId) {
        this.trackListId = trackListId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public ArrayList<Track> getPopularTracks() {
        return popularTracks;
    }

    public void setPopularTracks(ArrayList<Track> popularTracks) {
        this.popularTracks = popularTracks;
    }
}
