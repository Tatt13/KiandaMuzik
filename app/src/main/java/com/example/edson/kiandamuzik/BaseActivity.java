package com.example.edson.kiandamuzik;

import android.os.AsyncTask;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import fragments.NowPlayingFragment;

/**
 * Created by Edson on 10/01/2018.
 */

public class BaseActivity extends AppCompatActivity {

    // A tarefa pode ser executada apenas uma vez (uma exceção será lançada se uma segunda execução for tentada)
    public class initNowPlayingControls extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... strings) {

            final NowPlayingFragment nowPlayingFragment = new NowPlayingFragment();
            final FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.quick_controls_container, nowPlayingFragment)
                    .commitAllowingStateLoss();


            return "Executed";
        }
    }
}
