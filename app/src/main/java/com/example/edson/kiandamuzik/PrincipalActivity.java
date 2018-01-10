package com.example.edson.kiandamuzik;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;

import adapters.PopularTracksAdapter;
import models.Album;
import models.Artist;
import models.PopularTrackList;
import models.Track;

public class PrincipalActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        if(getActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        RecyclerView recyclerView = findViewById(R.id.artistList);
        Artist artist = new Artist();
        artist.setArtistCover(R.drawable.big_shaq_track);
        artist.setId(0);
        artist.setDescription("");
        artist.setMusicStyle("RNB");
        artist.setName("Big Shag");

        Album bigOne = new Album(0,"Big One",artist.getId(),"20-11-16","500");
        Track track = new Track();
        track.setaName("Urna");
        track.setAlbum(bigOne);
        track.setArtist(artist);
        track.setTrackCover(R.drawable.big_shaq_track);
        //track.setTrackId(0);

        Track track1 = new Track();
        track1.setaName("Urna");
        track1.setAlbum(bigOne);
        track1.setArtist(artist);
        track1.setTrackCover(R.drawable.galaxia);

        Track track2 = new Track();
        track2.setaName("Urna");
        track2.setAlbum(bigOne);
        track2.setArtist(artist);
        track2.setTrackCover(R.drawable.ed_sheeran);

        Track track3 = new Track();
        track3.setaName("Urna");
        track3.setAlbum(bigOne);
        track3.setArtist(artist);
        track3.setTrackCover(R.drawable.landrick_cover);

        Track track4 = new Track();
        track4.setaName("Urna");
        track4.setAlbum(bigOne);
        track4.setArtist(artist);
        track4.setTrackCover(R.drawable.anselmo_ralph);


        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(track);
        tracks.add(track1);
        tracks.add(track3);
        tracks.add(track4);



        PopularTrackList popularTrackList = new PopularTrackList(0, artist.getId(), tracks);
        popularTrackList.setPopularTracks(tracks);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PopularTracksAdapter tracksAdapter = new PopularTracksAdapter(this, popularTrackList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(tracksAdapter);


        new initNowPlayingControls().execute();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== R.id.action_acerca) {
            startActivity(new Intent(this, AboutActivity.class));
        }else{
            startActivity(new Intent(this, AboutActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
