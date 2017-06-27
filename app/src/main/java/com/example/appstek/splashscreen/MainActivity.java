package com.example.appstek.splashscreen;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_scren);
        mediaPlayer = MediaPlayer.create(this, R.raw.testsong_20_sec);
        mediaPlayer.start();
*/

        Thread thread = new Thread(){


            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);
                }
                catch (InterruptedException ie){
                    ie.printStackTrace();
                }
                finally {

                    Intent intent = new Intent(MainActivity.this,Splash.class);
                    startActivity(intent);

                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
       // mediaPlayer.release();

    }
}

