package com.example.edson.kiandamuzik;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapters.ArtistTrackAdapter;
import adapters.PopularTracksAdapter;
import models.Album;
import models.ArtistTrackList;
import models.Artist;
import models.Track;

public class TelaArtistaDetalhada extends AppCompatActivity {

    RecyclerView listaDeMusicas;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaDeMusicas = findViewById(R.id.listaDeMusicas);
        setTitle("Força Suprema");
        Artist fs = new Artist( 1, "Força Suprema", "descripton",
                "HipHop",  R.drawable.header,  true );
        Track urna = new Track();
        Album caveira = new Album( 1, "  Caveira", fs.getId(),  "2017", "500,00kz");
        urna.setAlbum(caveira);
        urna.setArtist(fs);
        urna.setTrackCover(R.drawable.fs);
        urna.setId(1);
        urna.setaName("Urna");
        // Adiciona uma urna na track para ser exibida a track
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(urna);
        ArtistTrackList fsTrackList = new ArtistTrackList(1, fs.getId(), tracks);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaDeMusicas.setLayoutManager(linearLayoutManager);
        ArtistTrackAdapter adapter = new ArtistTrackAdapter(this, fsTrackList);
        listaDeMusicas.setAdapter(adapter);

    }
}
