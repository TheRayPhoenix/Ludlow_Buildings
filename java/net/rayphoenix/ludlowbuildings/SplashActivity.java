package net.rayphoenix.ludlowbuildings;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Generate and start MediaPlayer with ten second clip of "Closer To The Heart" opening
        MediaPlayer mpSplash;
        mpSplash = MediaPlayer.create(this, R.raw.splashtrack);
        mpSplash.start();

        //Create a TimerTask to wait ten seconds and then...
        TimerTask task = new TimerTask(){

            @Override
            public void run() {
                finish();
                //... start MainActivity
                startActivity(new Intent(SplashActivity.this, ItemListActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,10000); // <- 10 seconds
    }
}
