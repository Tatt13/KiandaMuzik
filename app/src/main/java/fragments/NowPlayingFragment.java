package fragments;

import android.os.Bundle;
import android.provider.Contacts;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.edson.kiandamuzik.R;

import custom_views.PlayPauseButton;

public class NowPlayingFragment extends Fragment {

    private ProgressBar musicProgress;
    private ImageView artistCover;
    private TextView songTitle,
            artistName;
    private PlayPauseButton playPauseButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //Inflates the Contacts.Intents.UI and get the referneces to its components
        View elemView = inflater.inflate(R.layout.now_playing, container, false);
        musicProgress = elemView.findViewById(R.id.controls_progress_bar);
        artistCover = elemView.findViewById(R.id.controls_album_art);
        songTitle = elemView.findViewById(R.id.controls_song_title);
        artistName = elemView.findViewById(R.id.controls_artist_name);
        playPauseButton = elemView.findViewById(R.id.playPauseButton2);

        playPauseButton.setPlayed(false);


        return elemView;
    }
}
