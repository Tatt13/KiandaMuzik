package com.example.edson.kiandamuzik;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

import adapters.PopularTracksAdapter;
import models.Album;
import models.Artist;
import models.PopularTrackList;
import models.Track;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        RecyclerView recyclerView = findViewById(R.id.artistList);
        Artist artist = new Artist();
        artist.setArtistCover(R.drawable.big_shaq_track);
        artist.setId(0);
        artist.setDescription("");
        artist.setMusicStyle("RNB");
        artist.setName("Big Shag");

        Album bigOne = new Album(0,"Big One",artist.getId(),"20-11-16","500");
        Track track = new Track();
        track.setAlbum(bigOne);
        track.setArtist(artist);
        track.setTrackCover(R.drawable.big_shaq_track);
        //track.setTrackId(0);

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(track);

        PopularTrackList popularTrackList = new PopularTrackList(0, artist.getId(), tracks);
        popularTrackList.setPopularTracks(tracks);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PopularTracksAdapter tracksAdapter = new PopularTracksAdapter(this, popularTrackList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(tracksAdapter);

    }
}
